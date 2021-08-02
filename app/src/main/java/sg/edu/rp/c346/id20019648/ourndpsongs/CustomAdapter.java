package sg.edu.rp.c346.id20019648.ourndpsongs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Song> songList;

    public CustomAdapter(Context context, int resource, ArrayList<Song> objects) {
        super (context, resource, objects);

        parent_context = context;
        layout_id = resource;
        songList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //"Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        //Obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvStar = rowView.findViewById(R.id.tvStar);
        TextView tvSinger = rowView.findViewById(R.id.tvSinger);
        TextView tvYear = rowView.findViewById(R.id.tvYear);

        Song song = songList.get(position);

        //Set values to the TextView to display the corresponding information
        tvTitle.setText(songList.get(position).getTitle());
        tvTitle.setText(songList.get(position).toString());

        tvStar.setText(songList.get(position).getTitle());
        tvStar.setText(songList.get(position).toString());

        tvSinger.setText(songList.get(position).getTitle());
        tvSinger.setText(songList.get(position).toString());

        tvYear.setText(songList.get(position).getTitle());
        tvYear.setText(songList.get(position).toString());

        return rowView;
    }
}