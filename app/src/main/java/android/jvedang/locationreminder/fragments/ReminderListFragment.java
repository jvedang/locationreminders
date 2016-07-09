package android.jvedang.locationreminder.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.jvedang.locationreminder.R;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReminderListFragment extends Fragment {


    String title;
    public static ReminderListFragment newInstance(String title) {
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        ReminderListFragment fragment = new ReminderListFragment();
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = getArguments().getString("title");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout frameLayout = (FrameLayout)inflater.inflate(R.layout.fragment_reminder_list, container, false);

        TextView displayText = (TextView)frameLayout.findViewById(R.id.displayText);

        if(title.equals("active")) {
            displayText.setText("ACTIVE TAB");
        } else {
            displayText.setText("DISMISSED TAB");
        }


        return frameLayout;
    }

}
