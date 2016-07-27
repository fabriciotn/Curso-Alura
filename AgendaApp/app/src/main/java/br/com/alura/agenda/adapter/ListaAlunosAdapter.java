package br.com.alura.agenda.adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.alura.agenda.R;
import br.com.alura.agenda.modelo.Aluno;

/**
 * Created by fabriciotn on 13/02/16.
 */
public class ListaAlunosAdapter extends BaseAdapter {

    private Activity activity;
    private List<Aluno> alunos;

    public ListaAlunosAdapter(Activity activity, List<Aluno> alunos){
        this.activity = activity;
        this.alunos = alunos;
    }

    @Override
    public int getCount() {
        return alunos.size();
    }

    @Override
    public Object getItem(int position) {
        return alunos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return alunos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = activity.getLayoutInflater().inflate(R.layout.item, null);
        }

        Aluno aluno = alunos.get(position);

        TextView nome = (TextView) view.findViewById(R.id.item_nome);
        nome.setText(aluno.getNome());

        TextView telefone = (TextView) view.findViewById(R.id.item_telefone);
        telefone.setText(aluno.getTelefone());

        Bitmap bm;
        if(aluno.getCaminhoFoto() != null){
            bm = BitmapFactory.decodeFile(aluno.getCaminhoFoto());
        }else{
            bm = BitmapFactory.decodeResource(activity.getResources(), R.drawable.ic_no_image);
        }

        bm = Bitmap.createScaledBitmap(bm, 100, 100, true);
        ImageView foto = (ImageView) view.findViewById(R.id.item_foto);
        foto.setImageBitmap(bm);

        if(position % 2 == 0){
            view.setBackgroundColor(activity.getResources().getColor(R.color.linha_par));
        }else{
            view.setBackgroundColor(activity.getResources().getColor(R.color.linha_impar));
        }

        return view;
    }
}
