package jp.techacademy.shimpei.kantou.humankadai;

import android.util.Log;

class Human extends Animal implements Thinkable {

    // コンストラクタ
    public Human(String hobby, String name, int age) {
        this.hobby = hobby;
        this.name = name;
        this.age = age;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "「私の名前は" + this.name + "です。」" + "「年は" + this.age + "歳です。」") ;
    }

    @Override
    public void think() {
        Log.d("javatest", "「私は" + this.hobby + "について考える」" );
    }
}