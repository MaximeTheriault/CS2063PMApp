package ca.unb.mobiledev.pm_app;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;

public class ProjectPage extends AppCompatActivity {

    private TextView projectNameTextView;

    private Button groupChatButton;
    private Button tasksButton;
    private Button membersButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projectpage);

        projectNameTextView = findViewById(R.id.tv_projectname);

        groupChatButton = findViewById(R.id.btn_groupchat);
        tasksButton = findViewById(R.id.btn_tasks);
        membersButton = findViewById(R.id.btn_members);

        Intent intent = getIntent();
        String projectId = intent.getStringExtra("projectId");
        String projectName = intent.getStringExtra("projectName");
        projectNameTextView.setText(projectName);

        //not added yet
        groupChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectPage.this, ProjectPage.class);
                intent.putExtra("projectId", projectId);
                intent.putExtra("projectName", projectName);
                startActivity(intent);
                finish();
            }
        });

        //not added yet
        tasksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectPage.this, ProjectPage.class);
                intent.putExtra("projectId", projectId);
                intent.putExtra("projectName", projectName);
                startActivity(intent);
                finish();
            }
        });


        membersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectPage.this, MembersList.class);
                intent.putExtra("projectId", projectId);
                intent.putExtra("projectName", projectName);
                startActivity(intent);
            }
        });
    }
}
