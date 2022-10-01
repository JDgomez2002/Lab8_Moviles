package gt.uvg.garageversion20

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import gt.uvg.garageversion20.databinding.ActivityMainBinding
//import gt.uvg.garageversion20.R

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    // Keeps track of which LayoutManager is in use for the [RecyclerView]

    //Navigation controller
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //creador del binder
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host) as NavHostFragment
        navController = navHostFragment.navController
        //controlador de botones
        setupActionBarWithNavController(navController)
    }

    //Back button
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}