package com.example.grozziierabitdialouge;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button loginDialog;
    Button colorfulDialog;
    Button largeDialog;
    Button iconDialog;
    Button optionDialog;
    private static final String WHITE ="#FFFFFF" ;
    private static final String BLACK ="#FFFFFF" ;
    private static final String PURPLE ="#8A56AC" ;
    private static final String LIGHT_PURPLE ="#D47FA6" ;
    private static final String GREY_PURPLE ="#998FA2" ;
    private static final String DARK_PURPLE ="#241332" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void defaultdialouge(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Title")
                .setMessage("It is a message")
                .setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create().show();;
    }

    public void cusdef(View view) {
        RabitSimpleDialougee rabitSimpleDialouge=new RabitSimpleDialougee(MainActivity.this);
        rabitSimpleDialouge.setTitle("Simple")
                .setMessage("It is simple message.")
                .setyesbuttonClicklistener("Yes", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                }).setnobuttonClicklisener("No", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rabitSimpleDialouge.dismiss();
            }
        })
                .create();
        rabitSimpleDialouge.show();
    }

    public void success(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Title")
                .setMessage("It is a success message")
                .setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create().show();
    }

    public void cus_success(View view) {
        RabitSuccesDialouge rabitSimpleDialouge=new RabitSuccesDialouge(MainActivity.this);
        rabitSimpleDialouge.setTitle("Simple")
                .setMessage("It is simple success  message.")
                .setyesbuttonClicklistener("Yes", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                }).setnobuttonClicklisener("No", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rabitSimpleDialouge.dismiss();
            }
        })
                .closeOnclicklistener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                })
                .create();
        rabitSimpleDialouge.show();
    }

    public void cus_info(View view) {
        RabitInfoDialouge rabitSimpleDialouge=new RabitInfoDialouge(MainActivity.this);
        rabitSimpleDialouge.setTitle("Simple")
                .setMessage("It is simple Info  message.")
                .setyesbuttonClicklistener("Yes", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                }).setnobuttonClicklisener("No", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rabitSimpleDialouge.dismiss();
            }
        })
                .closeOnclicklistener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                })
                .create();
        rabitSimpleDialouge.show();
    }

    public void def_info(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Title")
                .setMessage("It is a info message")
                .setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create().show();
    }

    public void cus_warning(View view) {
        RabitWarningDialougee rabitSimpleDialouge=new RabitWarningDialougee(MainActivity.this);
        rabitSimpleDialouge.setTitle("Simple")
                .setMessage("It is simple Info  message.")
                .setyesbuttonClicklistener("Yes", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                }).setnobuttonClicklisener("No", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rabitSimpleDialouge.dismiss();
            }
        })
                .closeOnclicklistener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                })
                .create();
        rabitSimpleDialouge.show();
    }

    public void def_warning(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Title")
                .setMessage("It is a Warning message")
                .setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create().show();
    }

    public void def_error(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Title")
                .setMessage("It is a error message")
                .setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create().show();
    }

    public void cus_error(View view) {
        RabitErrorDialouge rabitSimpleDialouge=new RabitErrorDialouge(MainActivity.this);
        rabitSimpleDialouge.setTitle("Simple")
                .setMessage("It is simple error  message.")
                .setyesbuttonClicklistener("Yes", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                }).setnobuttonClicklisener("No", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rabitSimpleDialouge.dismiss();
            }
        })
                .closeOnclicklistener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                })
                .create();
        rabitSimpleDialouge.show();
    }

    public void def_exit(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Title")
                .setMessage("It is exit message")
                .setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create().show();
    }

    public void cus_exit(View view) {
        RabitExitDialougee rabitSimpleDialouge=new RabitExitDialougee(MainActivity.this);
        rabitSimpleDialouge.setTitle("Simple")
                .setMessage("It is simple exit  message.")
                .setyesbuttonClicklistener("Exit", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                }).setnobuttonClicklisener("Cancel", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rabitSimpleDialouge.dismiss();
            }
        })
                .closeOnclicklistener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rabitSimpleDialouge.dismiss();
                    }
                })
                .create();
        rabitSimpleDialouge.show();
    }

    public void def_toast(View view) {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
    }

    public void cus_toast(View view) {
        RabitToast.success(getApplicationContext(),"Hi",Toast.LENGTH_SHORT,true).show();
    }

    public void def_toast_success(View view) {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
    }

    public void cus_toast_success(View view) {
        RabitToast.success(getApplicationContext(),"Hi",Toast.LENGTH_SHORT,true).show();
    }

    public void def_toast_info(View view) {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
    }

    public void cus_toast_info(View view) {
        RabitToast.info(getApplicationContext(),"Hi",Toast.LENGTH_SHORT,true).show();
    }

    public void def_toast_warning(View view) {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
    }

    public void cus_toast_warning(View view) {
        RabitToast.warning(getApplicationContext(),"Hi",Toast.LENGTH_SHORT,true).show();
    }

    public void def_toast_error(View view) {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
    }

    public void cus_toast_error(View view) {
        RabitToast.error(getApplicationContext(),"Hi",Toast.LENGTH_SHORT,true).show();
    }

    public void dif_edit(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Title")
                .setMessage("It is exit message")
                .setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create().show();
    }


    public void login_dialog(View view) {
        final RabitGrozziieDialouge flatDialog = new RabitGrozziieDialouge(MainActivity.this);
        flatDialog.setTitle("Login")
                .setSubtitle("write your profile info here")
                .setFirstTextFieldHint("email")
                .setSecondTextFieldHint("password")
                .setSecondTextFieldInputType(0, true)
                .setFirstButtonText("CONNECT")
                .setSecondButtonText("CANCEL")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, flatDialog.getFirstTextField(), Toast.LENGTH_SHORT).show();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }

    public void colorful_dialog(View view) {
        final RabitGrozziieDialouge flatDialog = new RabitGrozziieDialouge(MainActivity.this);
        flatDialog.setBackgroundColor(Color.parseColor("#1a2849"))
                .setTitle("Profile")
                .setFirstTextFieldHint("write here anything !")
                .setFirstButtonColor(Color.parseColor("#e3c878"))
                .setFirstButtonTextColor(Color.parseColor("#FFFFFF"))
                .setFirstButtonText("ADD")
                .setSecondButtonColor(Color.parseColor("#ed9a73"))
                .setSecondButtonTextColor(Color.parseColor("#FFFFFF"))
                .setSecondButtonText("UPDATE")
                .setThirdButtonColor(Color.parseColor("#e688a1"))
                .setThirdButtonTextColor(Color.parseColor("#FFFFFF"))
                .setThirdButtonText("DELETE")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .withThirdButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }

    public void large_dialog(View view) {
        final RabitGrozziieDialouge flatDialog = new RabitGrozziieDialouge(MainActivity.this);
        flatDialog.setTitle("Send a message")
                .setTitleColor(Color.parseColor("#000000"))
                .setBackgroundColor(Color.parseColor("#f5f0e3"))
                .setLargeTextFieldHint("write your text here ...")
                .setLargeTextFieldHintColor(Color.parseColor("#000000"))
                .setLargeTextFieldBorderColor(Color.parseColor("#000000"))
                .setLargeTextFieldTextColor(Color.parseColor("#000000"))
                .setFirstButtonColor(Color.parseColor("#fda77f"))
                .setFirstButtonTextColor(Color.parseColor("#000000"))
                .setFirstButtonText("Done")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }

    public void icon_dialog(View view) {
        final RabitGrozziieDialouge flatDialog = new RabitGrozziieDialouge(MainActivity.this);
        flatDialog.setIcon(R.drawable.crying)
                .setTitle("Somthing went wrong !")
                .setTitleColor(Color.parseColor("#000000"))
                .setSubtitle("choose an action")
                .setSubtitleColor(Color.parseColor("#000000"))
                .setBackgroundColor(Color.parseColor("#a26ea1"))
                .setFirstButtonColor(Color.parseColor("#f18a9b"))
                .setFirstButtonTextColor(Color.parseColor("#000000"))
                .setFirstButtonText("Try again")
                .setSecondButtonColor(Color.parseColor("#ffff9d"))
                .setSecondButtonTextColor(Color.parseColor("#000000"))
                .setSecondButtonText("Send rapport")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }

    public void option_dialog(View view) {
        final RabitGrozziieDialouge flatDialog = new RabitGrozziieDialouge(MainActivity.this);
        flatDialog.setTitle("Option dialog")
                .setTitleColor(Color.parseColor(BLACK))
                .setBackgroundColor(Color.parseColor("#2596be"))
                .setFirstButtonColor(Color.parseColor("#d3f6f3"))
                .setFirstButtonTextColor(Color.parseColor(BLACK))
                .setFirstButtonText("ADD")
                .setSecondButtonColor(Color.parseColor("#fee9b2"))
                .setSecondButtonTextColor(Color.parseColor(BLACK))
                .setSecondButtonText("UPDATE")
                .setThirdButtonColor(Color.parseColor("#fbd1b7"))
                .setThirdButtonTextColor(Color.parseColor(BLACK))
                .setThirdButtonText("DELETE")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .withThirdButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }
}