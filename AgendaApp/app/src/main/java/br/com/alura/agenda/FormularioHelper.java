package br.com.alura.agenda;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;

import br.com.alura.agenda.modelo.Aluno;

/**
 * Created by fabriciotn on 09/02/16.
 */
public class FormularioHelper {

    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoTelefone;
    private final EditText campoSite;
    private final RatingBar campoNota;
    private final ImageView caminhoFoto;
    private Aluno aluno;

    public FormularioHelper(FormularioActivity activity) {
        campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        campoSite = (EditText) activity.findViewById(R.id.formulario_site);
        campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);
        caminhoFoto = (ImageView) activity.findViewById(R.id.formulario_foto);
        aluno = new Aluno();
    }

    public Aluno pegaAluno(){
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return aluno;
    }

    public void preencheFormulario(Aluno aluno) {
        this.aluno = aluno;
        campoNome.setText(aluno.getNome());
        campoEndereco.setText(aluno.getEndereco());
        campoTelefone.setText(aluno.getTelefone());
        campoSite.setText(aluno.getSite());
        campoNota.setProgress(aluno.getNota().intValue());
        if(aluno.getCaminhoFoto() != null){
            carregaImagem(aluno.getCaminhoFoto());
        }
    }

    public ImageView getCaminhoFoto() {
        return caminhoFoto;
    }

    public void carregaImagem(String localArquivoFoto) {
        aluno.setCaminhoFoto(localArquivoFoto);

        Bitmap imagem = BitmapFactory.decodeFile(localArquivoFoto);
        Bitmap imagemReduzida = Bitmap.createScaledBitmap(imagem, 300, 300, true);
        caminhoFoto.setScaleType(ImageView.ScaleType.FIT_XY);
        caminhoFoto.setImageBitmap(imagemReduzida);
    }
}
