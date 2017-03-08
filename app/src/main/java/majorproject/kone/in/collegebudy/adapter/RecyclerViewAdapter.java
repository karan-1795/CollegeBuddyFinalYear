package majorproject.kone.in.collegebudy.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

import majorproject.kone.in.collegebudy.R;
import majorproject.kone.in.collegebudy.activity.Reminder;
import majorproject.kone.in.collegebudy.activity.ReminderList;

/**
 * Created by batra on 25-01-2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    public List<ReminderList> allReminderList;

    public RecyclerViewAdapter(List<ReminderList> reminderList) {
        this.allReminderList = reminderList;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,day,month,year;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            day = (TextView) itemView.findViewById(R.id.day);
            month = (TextView) itemView.findViewById(R.id.month);
            year = (TextView) itemView.findViewById(R.id.year);

        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_content,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ReminderList reminderList = allReminderList.get(position);
        holder.title.setText(reminderList.getTitle());
        holder.day.setText(reminderList.getDay());
        holder.month.setText(reminderList.getMonth());
        holder.year.setText(reminderList.getYear());

    }

    @Override
    public int getItemCount() {
        return allReminderList.size();
    }


}
