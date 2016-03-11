package com.example.lightsoo.myglide.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.lightsoo.myglide.Data.ImageItem;
import com.example.lightsoo.myglide.ViewHolder.ImageItemView;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends BaseAdapter{

    List<ImageItem> items = new ArrayList<ImageItem>();

    int totalCount;

    public void add(ImageItem item) {
        items.add(item);
        notifyDataSetChanged();
    }

    public void addAll(List<ImageItem> items){
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    public void clear() {
        items.clear();
        notifyDataSetChanged();
    }

    //pagenation을 위한 첫 index, 마지막 index설정
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public int getTotalCount() {
        return totalCount;
    }

    public int getStartIndex() {
        if (items.size() < totalCount) {
            //다음 페이지를 위해 +1인데 뭔가 더 작업이 필요할듯...
            //단순히 +1이면 계속 한개씩 된다는게 뭔가 내생각에는 이상한데...
            return items.size() + 1;
        }
        return -1;
    }




    @Override
    public int getCount() {
        return items.size();
    }

    //item리턴
    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    //item번호 리턴
    @Override
    public long getItemId(int position) {
        return position;
    }

    //출력할 view를 설정후 리턴
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageItemView view;
        if(convertView == null){
            view = new ImageItemView(parent.getContext());
        }else{
            view = (ImageItemView)convertView;
        }
        view.setImageItem(items.get(position));
        return view;
    }
}
