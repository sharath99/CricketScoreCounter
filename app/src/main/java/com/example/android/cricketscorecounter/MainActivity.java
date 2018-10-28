package com.example.android.cricketscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sixa(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_a);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_a);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 6;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void foura(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_a);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_a);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 4;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void threea(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_a);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_a);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 3;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void twoa(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_a);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_a);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 2;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void onea(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_a);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_a);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 1;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void wicketa(View v) {
        TextView s = (TextView) findViewById(R.id.wicket_a);
        String x = (String) s.getText();
        int a = Integer.parseInt(x);
        if (a < 10) {
            a = a + 1;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }

    }

    public void noballa(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_a);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_a);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 1;
            String y = String.valueOf(a);
            s.setText(y);
            TextView p = (TextView) findViewById(R.id.extras_a);
            String o = (String) p.getText();
            int i = Integer.parseInt(o);
            i = i + 1;
            String u = String.valueOf(i);
            p.setText(u);
        }
    }

    public void widea(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_a);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_a);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 1;
            String y = String.valueOf(a);
            s.setText(y);
            TextView p = (TextView) findViewById(R.id.extras_a);
            String o = (String) p.getText();
            int i = Integer.parseInt(o);
            i = i + 1;
            String u = String.valueOf(i);
            p.setText(u);
        }
    }


    public void sixb(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_b);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_b);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 6;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void fourb(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_b);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_b);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 4;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void threeb(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_b);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_b);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 3;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void twob(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_b);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_b);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 2;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void oneb(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_b);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_b);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 1;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void wicketb(View v) {
        TextView s = (TextView) findViewById(R.id.wicket_b);
        String x = (String) s.getText();
        int a = Integer.parseInt(x);
        if (a < 10) {
            a = a + 1;
            String x1 = String.valueOf(a);
            s.setText(x1);
        }
    }

    public void noballb(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_b);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_b);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 1;
            String y = String.valueOf(a);
            s.setText(y);
            TextView p = (TextView) findViewById(R.id.extras_b);
            String o = (String) p.getText();
            int i = Integer.parseInt(o);
            i = i + 1;
            String u = String.valueOf(i);
            p.setText(u);
        }
    }

    public void wideb(View v) {
        TextView m = (TextView) findViewById(R.id.wicket_b);
        String n = (String) m.getText();
        int l = Integer.parseInt(n);
        if (l < 10) {
            TextView s = (TextView) findViewById(R.id.score_b);
            String x = (String) s.getText();
            int a = Integer.parseInt(x);
            a = a + 1;
            String y = String.valueOf(a);
            s.setText(y);
            TextView p = (TextView) findViewById(R.id.extras_b);
            String o = (String) p.getText();
            int i = Integer.parseInt(o);
            i = i + 1;
            String u = String.valueOf(i);
            p.setText(u);
        }
    }
    public void reset(View v)
    {
        TextView w = (TextView) findViewById(R.id.wicket_a);
        TextView w1 = (TextView) findViewById(R.id.wicket_b);
        TextView s = (TextView) findViewById(R.id.extras_a);
        TextView s1 = (TextView) findViewById(R.id.extras_b);
        TextView m = (TextView) findViewById(R.id.score_a);
        TextView m1 = (TextView) findViewById(R.id.score_b);
        m1.setText("0");
        m.setText("0");
        w1.setText("0");
        w.setText("0");
        s.setText("0");
        s1.setText("0");
    }
}
