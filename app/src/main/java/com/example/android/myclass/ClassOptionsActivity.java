package com.example.android.myclass;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ClassOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_options);


        /*Button attendance = (Button) findViewById(R.id.take_attendance_button);
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = view.getContext();
                Intent i = new Intent(context, TakeAttendanceActivity.class);
                context.startActivity(i);
            }
        });
        Button viewStds = (Button) findViewById(R.id.view_students_button);
        viewStds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = view.getContext();
                Intent i = new Intent(context,StudentListActivity.class);
                context.startActivity(i);
            }
        });
        Button viewAssignments = (Button) findViewById(R.id.view_assignments_button);
        viewStds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = view.getContext();
                Intent i = new Intent(context,AssignmentListActivity.class);
                context.startActivity(i);
            }
        });*/
    }

    public void startAttendance(View view) {
        Context context = view.getContext();
        Intent i = new Intent(context, TakeAttendanceActivity.class);
        context.startActivity(i);
    }
    public void startStudents(View view) {
        Context context = view.getContext();
        Intent i = new Intent(context,StudentListActivity.class);
        context.startActivity(i);
    }
    public void startAssignments(View view) {
        Context context = view.getContext();
        Intent i = new Intent(context,AssignmentListActivity.class);
        context.startActivity(i);
    }
}
