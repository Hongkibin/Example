package org.techtown.example;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CosmeticListAdapter extends BaseAdapter{

    private Context context;
    private List<Cosmetic> cosmeticList;

    public CosmeticListAdapter(Context context, List<Cosmetic> cosmeticList) {
        this.context = context;
        this.cosmeticList = cosmeticList;
    }

    @Override
    public int getCount() {
        return cosmeticList.size();
    }

    @Override
    public Object getItem(int i) {
        return cosmeticList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.cosmetic,null);
 /*       TextView categoryIdText = (TextView) v.findViewById(R.id.categoryIdText);
        TextView cosmeticIdText = (TextView) v.findViewById(R.id.cosmeticIdText);*/
        TextView cosmeticText = (TextView) v.findViewById(R.id.cosmeticText);

/*        categoryIdText.setText(cosmeticList.get(i).getCategory_id());
            자꾸 이놈에서 에러가 나는데 이것이 setText인데 그 안에가 int형이라서 나는 것이랫음. 그래서 일단 솔지기 아이디 받을필요
            없으니까 일단 이름만 받으면 대니까 일단 이름만 살려두고 아이디 우선 주석처리핸다. 필요시 주석풀자.
        cosmeticIdText.setText(cosmeticList.get(i).getCosmetic_id());*/
        cosmeticText.setText(cosmeticList.get(i).getName());

        v.setTag(cosmeticList.get(i).getName());
        return v;
    }
}
