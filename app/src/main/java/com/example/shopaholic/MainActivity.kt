package com.example.shopaholic

import android.content.Intent
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopaholic.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class
MainActivity : AppCompatActivity(), OnHallItemClickListener {

    lateinit var binding: ActivityMainBinding
    lateinit var halllist: ArrayList<Halls>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        halllist = ArrayList ()
        addHalls()

        hallRecycler.layoutManager = LinearLayoutManager(this)
        hallRecycler.addItemDecoration(DividerItemDecoration(this,1))
        hallRecycler.adapter = HallAdapter(halllist,this)

    }
    fun addHalls() {
        halllist.add(Halls( "Opera's Pepperoni Pizza",  "This one is cheesy, spicy and loaded with pepperoni! Perfect pizza to cook and relax with friends.",
            logo = R.drawable.pizza1))
        halllist.add(Halls("Opera's Multigrain  Pizza",  "Good food is a combination of mouth-watering flavours and healthy ingredients. Your favourite pizza gets a healthy makeover with a multi-grain base. Make the base from scratch with whole wheat flour, oats, maize flour and nutrient-dense seeds. Top it up with some mushrooms or whatever you like. Make this multigrain pizza at home and indulge guilt-free!",
            logo = R.drawable.pizza2))
        halllist.add(Halls( "Opera's Chicken Pizza",  "This Italian favorite pizza is a delicious mix of flat bread or base topped with cheese, chillies, onion, garlic sauce and chunks of chicken. Explore the juiciness of meaty chicken chunks embedded in gooey cheesiness. It can't get better than this.",
            logo = R.drawable.pizza3))
        halllist.add(Halls( "Opera's Margherita Pizza Recipe",   "Make way for the all time favourite pizza!  Margherita Pizza is to many the true Italian flag as it was created resembling the colors of the Italian flag, red (tomato), white (mozzarella) and green (basil). Since then this classic pizza has never disappointed anyone.\n",
            logo = R.drawable.pizza4))
        halllist.add(Halls( "Opera's Kebab and Paneer Pizza Recipe",  "Think out-of-the-box-cooking, think fusion food. This is what you get when Italian cooking marries Indian flavours. A mouth watering pizza recipe that is sure to tantalize your taste buds. This fusion of Mughlai seekh kebab and Italian pizza recipe is easy and quick.\n",
            logo = R.drawable.pizza5))
        halllist.add(Halls( "Opera's Wholegrain Pizza Recipe",  "A brilliant, gorgeous looking pizza that is high on flavour yet low on calories can strike a deal with anyone, right? A healthy way to satiate those cravings of Pizza, this wholegrain pizza has fresh dough made with whole wheat flour topped with tomato sauce, mushrooms, cheese and baked to perfection. \n",
            logo = R.drawable.pizza6))
        halllist.add(Halls( "Opera's Scone Pizza Recipe",  "Making a scone based pizza is a great way to save time. It is quick and does not require yeast. The crust is thin and soft somewhat similar to a bread base.\n",
            logo = R.drawable.pizza7))
        halllist.add(Halls( "Opera's Vegetarian Pizza Recipe",  "Garden fresh veggies come together to Experience! topped with Mexican gems like kidney beans and tossed with a fiery hot sauce, this pizza recipe is going to be a stellar one!\n",
            logo = R.drawable.pizza8))
        halllist.add(Halls( "Opera's Mini Mushroom Pizza Recipe",  "Get ready to gorge on these little pockets of cheesy delights. A delicious snack for parties, these Mini pizzas topped with mushrooms, corn and cheese are sure to get everyone's attention. Ready in a jiffy, these are an absolute crowd pleaser!\n" +
                "\n",
            logo = R.drawable.pizza9))


    }

    override fun onItemClick(item: Halls, position: Int) {
        //Toast.makeText(this, item.name , Toast.LENGTH_SHORT).show()
        val intent = Intent(this, HallDetailsActivity::class.java)
        intent.putExtra("PRODUCTNAME",item.name)
        intent.putExtra("PRODUCTDESC",item.description)
        intent.putExtra("PRODUCTLOGO",item.logo.toString())
        startActivity(intent)

    }
}


