package comsci.kalin.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER-35 on 2/23/2017.
 */
//
public class MyAdapter extends BaseAdapter {
    private Context context;
    private int[] ints;
    private String[] titleStrings , detailStrings;

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() { // ใช้นับจำนวนข้อมูลแล้วส่งต่อไปยัง getView
        return ints.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { // รับจำนวนข้อมูลและแสดงผลหน้าแอป
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview, parent , false);
        //Initial view

        ImageView imageView = (ImageView) view.findViewById(R.id.imvIcon);
        TextView titleTextView = (TextView) view.findViewById(R.id.txtTitleLiv);
        TextView detailTextView = (TextView) view.findViewById(R.id.txtDetailLiv);
        // Show View

        imageView.setImageResource(ints [position]);
        titleTextView.setText(titleStrings[position]);
        detailTextView.setText(detailStrings[position]);
        return view;
    }
}
