package br.com.alura.agenda;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.Serializable;

import br.com.alura.agenda.dao.AlunoDAO;
import br.com.alura.agenda.modelo.Aluno;

public class FormularioActivity extends AppCompatActivity {


    private FormularioHelper helper;
    private String localArquivoFoto;
    private static final int TIRA_FOTO = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        helper = new FormularioHelper(this);

        Intent intent = getIntent();
        Aluno aluno = (Aluno) intent.getSerializableExtra("aluno");
        if(aluno != null){
            helper.preencheFormulario(aluno);
        }

        Button botao_foto = (Button) findViewById(R.id.formulario_botao_foto);

        botao_foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                localArquivoFoto = getExternalFilesDir(null) +
                        "/"+ System.currentTimeMillis()+".png";

                File arquivo = new File(localArquivoFoto);
                Uri localFoto = Uri.fromFile(arquivo);

                Intent irParaCamera =
                        new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                irParaCamera.putExtra(MediaStore.EXTRA_OUTPUT, localFoto);
                startActivityForResult(irParaCamera, TIRA_FOTO);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == TIRA_FOTO){
            if(resultCode == Activity.RESULT_OK){
                helper.carregaImagem(localArquivoFoto);
            }else{
                localArquivoFoto = null;
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_formulario, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_formulario_ok:
                Aluno aluno = helper.pegaAluno();

                AlunoDAO dao = new AlunoDAO(this);

                if(aluno.getId() != null){
                    dao.altera(aluno);
                }else {
                    dao.insere(aluno);
                }
                dao.close();

                Toast.makeText(FormularioActivity.this, "Aluno " + aluno.getNome() + " salvo com sucesso!", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
