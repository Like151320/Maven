package like.maven

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import maven.like.testlibrary.TestPrint

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestPrint.printA()
    }
}
