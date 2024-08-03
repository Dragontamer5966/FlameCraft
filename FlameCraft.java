
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.image.*;
import javafx.scene.image.ImageView;
import java.util.Random;
import java.io.File;
import java.io.FileInputStream; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FlameCraft extends Application {
      //info variable

       //player items
      //Player 1
      int P1Breed = 7;
      int P1Meat = 7;
      int P1Potion = 7;
      int P1Iron = 7;
      int P1Gems = 7;
      int P1Plants = 7;
      int P1Coins = 7;
      int P1Points = 7;
      //Player 2
      int P2Breed = 0;
      int P2Meat = 0;
      int P2Potion = 0;
      int P2Iron = 0;
      int P2Gems = 0;
      int P2Plants = 0;
      int P2Coins = 0;
      int P2Points = 0;
      
      int player = 1;
      Location player1location;
      Location player2location;
      Location MeatDragonHold;
      int shop;
      int SlotHold;
      int DragonHold;
      int DragonFire;
      int DragonIron;
      int DragonPotion;
      dragon PotionDragonHold1;
      dragon PotionDragonHold2;
      Location PotionDragonLocationHold;
      
      int EnchantHold;
      int EnchantMultiHold;
      
/////////////////////////////////////////////////////////////////////////////////////////////////      
   public void start(Stage primaryStage) {
      //Set grid Pane
      GridPane pane = new GridPane();
      pane.setPadding(new Insets(10, 10, 10, 10));
      pane.setVgap(5);
      //flowpanes for each shop
      FlowPane Shop1 = new FlowPane();
      FlowPane Shop2 = new FlowPane();
      FlowPane Shop3 = new FlowPane();
      FlowPane Shop4 = new FlowPane();
      FlowPane Shop5 = new FlowPane();
      FlowPane Shop6 = new FlowPane();
      FlowPane Shop7 = new FlowPane();
      FlowPane Shop8 = new FlowPane();
      FlowPane Shop9 = new FlowPane();
      FlowPane Shop10 = new FlowPane();
      FlowPane Shop11 = new FlowPane();
      FlowPane Shop12 = new FlowPane();
      
      FlowPane Shop1D = new FlowPane();
      FlowPane Shop2D = new FlowPane();
      FlowPane Shop3D = new FlowPane();
      FlowPane Shop4D = new FlowPane();
      FlowPane Shop5D = new FlowPane();
      FlowPane Shop6D = new FlowPane();
      FlowPane Shop7D = new FlowPane();
      FlowPane Shop8D = new FlowPane();
      FlowPane Shop9D = new FlowPane();
      FlowPane Shop10D = new FlowPane();
      FlowPane Shop11D = new FlowPane();
      FlowPane Shop12D = new FlowPane();
      
      Shop1.getChildren().add(Shop1D);
      Shop2.getChildren().add(Shop2D);
      Shop3.getChildren().add(Shop3D);
      Shop4.getChildren().add(Shop4D);
      Shop5.getChildren().add(Shop5D);
      Shop6.getChildren().add(Shop6D);
      Shop7.getChildren().add(Shop7D);
      Shop8.getChildren().add(Shop8D);
      Shop9.getChildren().add(Shop9D);
      Shop10.getChildren().add(Shop10D);
      Shop11.getChildren().add(Shop11D);
      Shop12.getChildren().add(Shop12D);
      
      pane.add(Shop1, 1, 1, 2, 1);
      pane.add(Shop2, 2, 1, 2, 1);
      pane.add(Shop3, 3, 1, 2, 1);
      pane.add(Shop4, 4, 1, 2, 1);
      pane.add(Shop5, 5, 1, 2, 1);
      pane.add(Shop6, 6, 1, 2, 1);
      pane.add(Shop7, 1, 3, 2, 1);
      pane.add(Shop8, 2, 3, 2, 1);
      pane.add(Shop9, 3, 3, 2, 1);
      pane.add(Shop10, 4, 3, 2, 1);
      pane.add(Shop11, 5, 3, 2, 1);
      pane.add(Shop12, 6, 3, 2, 1);

      
      //Stat up
      BorderPane root1 = new BorderPane();
      
      FlowPane root = new FlowPane();
      root.getChildren().add(Rules1());
      root.getChildren().add(Rules2());
      root1.getChildren().add(root);
      pane.add(root1, 7, 0);
      
      //Dragonlist();
      //Meat
      dragon Suzette = new dragon("Suzette", "Meat");
      Suzette.DragonImage = new Image("pics\\Suzette.jpg");
      
      dragon Hot_Dog = new dragon("Hot_Dog", "Meat");
      Hot_Dog.DragonImage = new Image("pics\\Hot_Dog.jpg");
      
      dragon Flambe = new dragon("Flambe", "Meat");
      Flambe.DragonImage = new Image("pics\\Flambe.jpg");
      
      dragon Skewart = new dragon("Skewart", "Meat");
      Skewart.DragonImage = new Image("pics\\Skewart.jpg");
      
      dragon Cutlet = new dragon("Cutlet", "Meat");
      Cutlet.DragonImage = new Image("pics\\Cutlet.jpg");
      
      dragon Brisket = new dragon("Brisket", "Meat");
      Brisket.DragonImage = new Image("pics\\Brisket.jpg");
      
      dragon Potato = new dragon("Potato", "Meat");
      Potato.DragonImage = new Image("pics\\Potato.jpg");
      
      dragon Hickory = new dragon("Hickory", "Meat");
      Hickory.DragonImage = new Image("pics\\Hickory.jpg");
      
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      //Potion
      dragon Jasmine = new dragon("Jasmine", "Potion");
      Jasmine.DragonImage = new Image("pics\\Jasmine.jpg");
      
      dragon Lavender = new dragon("Lavender", "Potion");
      Lavender.DragonImage = new Image("pics\\Lavender.jpg");
      
      dragon Earl = new dragon("Earl", "Potion");
      Earl.DragonImage = new Image("pics\\Earl.jpg");
      
      dragon Thistle = new dragon("Thistle", "Potion");
      Thistle.DragonImage = new Image("pics\\Thistle.jpg");
      
      dragon Elderberry = new dragon("Elderberry", "Potion");
      Elderberry.DragonImage = new Image("pics\\Elderberry.jpg");
      
      dragon Venti = new dragon("Venti", "Potion");
      Venti.DragonImage = new Image("pics\\Venti.jpg");
      
      dragon Tannin = new dragon("Tannin", "Potion");
      Tannin.DragonImage = new Image("pics\\Tannin.jpg");
      
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      //Gem
      dragon Frostfire = new dragon("Frostfire", "Gem");
      Frostfire.DragonImage = new Image("pics\\Frostfire.jpg");
      
      dragon Deathfang = new dragon("Deathfang", "Gem");
      Deathfang.DragonImage = new Image("pics\\Deathfang.jpg");
      
      dragon Moonbeam = new dragon("Moonbeam", "Gem");
      Moonbeam.DragonImage = new Image("pics\\Moonbeam.jpg");

      dragon Jewelheart = new dragon("Jewelheart", "Gem");
      Jewelheart.DragonImage = new Image("pics\\Jewelheart.jpg");
      
      dragon Silverscale = new dragon("Silverscale", "Gem");
      Silverscale.DragonImage = new Image("pics\\Silverscale.jpg");
      
      dragon Opalwing = new dragon("Opalwing", "Gem");
      Opalwing.DragonImage = new Image("pics\\Opalwing.jpg");
      
      dragon Brightgem = new dragon("Brightgem", "Gem");
      Brightgem.DragonImage = new Image("pics\\Brighgem.jpg");
      
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
      //Plant
      dragon Olive = new dragon("Olive", "Plant");
      Olive.DragonImage = new Image("pics\\Olive.jpg");
      
      dragon Blossom = new dragon("Blossom", "Plant");
      Blossom.DragonImage = new Image("pics\\Blossom.jpg");
      
      dragon Mulch = new dragon("Mulch", "Plant");
      Mulch.DragonImage = new Image("pics\\Mulch.jpg");
      
      dragon Dandelion = new dragon("Dandelion", "Plant");
      Dandelion.DragonImage = new Image("pics\\Dandelion.jpg");
      
      dragon Lotus = new dragon("Lotus", "Plant");
      Lotus.DragonImage = new Image("pics\\Lotus.jpg");
      
      dragon Herb = new dragon("Herb", "Plant");
      Herb.DragonImage = new Image("pics\\Herb.jpg");
      
      dragon Twig = new dragon("Twig", "Plant");
      Twig.DragonImage = new Image("pics\\Twig.jpg");
      
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      //Iron
      dragon Rusty = new dragon("Rusty", "Iron");
      Rusty.DragonImage = new Image("pics\\Rusty.jpg");
      
      dragon Flint = new dragon("Flint", "Iron");
      Flint.DragonImage = new Image("pics\\Flint.jpg");
      
      dragon Patina = new dragon("Patina", "Iron");
      Patina.DragonImage = new Image("pics\\Patina.jpg");
      
      dragon Roxanne = new dragon("Roxanne", "Iron");
      Roxanne.DragonImage = new Image("pics\\Roxanne.jpg");
      
      dragon Cole = new dragon("Cole", "Iron");
      Cole.DragonImage = new Image("pics\\Cole.jpg");
      
      dragon Shale = new dragon("Shale", "Iron");
      Shale.DragonImage = new Image("pics\\Shale.jpg");
      
      dragon Wingnut = new dragon("Wingnut", "Iron");
      Wingnut.DragonImage = new Image("pics\\Wingnut.jpg");
      
///////////////////////////////////////////////////////////////////////////////////////////////
      //Breed
      dragon Honey = new dragon("Honey", "Breed");
      Honey.DragonImage = new Image("pics\\Honey.jpg");
      
      dragon Fondue = new dragon("Fondue", "Breed");
      Fondue.DragonImage = new Image("pics\\Fondue.jpg");
      
      dragon Cookie = new dragon("Cookie", "Breed");
      Cookie.DragonImage = new Image("pics\\Cookie.jpg");
      
      dragon Cinnabun = new dragon("Cinnabun", "Breed");
      Cinnabun.DragonImage = new Image("pics\\Cinnabun.jpg");
      
      dragon Loaf = new dragon("Loaf", "Breed");
      Loaf.DragonImage = new Image("pics\\Loaf.jpg");
      
      dragon Pan = new dragon("Pan", "Breed");
      Pan.DragonImage = new Image("pics\\Pan.jpg");
      
////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
      //Shops();
      //Meat
      Shop Draco_Bell = new Shop("Draco_Bell", "Meat","start","NA", "Meat", "Iron", "Iron", "NA", "NA", "Coin","SD", false);
      Draco_Bell.ShopImage = new Image("pics\\DracoBell.jpg");
      
      Shop Fogo_de_Char = new Shop("Fogo_de_Char", "Meat","Meat","NA","Potion","Breed", "Wild", "NA", "Pointsx3", "SD","Pointsx2",true);
      Fogo_de_Char.ShopImage = new Image("pics\\Fogo_de_Char.jpg");
      
      Shop Full_Plate_Buffet = new Shop("Full_Plate_Buffet", "Meat","Breed","Meat","Potion","meat","Plant","meat","Pointsx3","SD","Coin",true);
      Full_Plate_Buffet.ShopImage = new Image("pics\\Full_Plate_Buffet.jpg");
      
      Shop Pizza_Coven = new Shop("Pizza_Coven", "Meat","Plant", "Meat","Potion","Breed","NA", "Meat","Pointsx3","Pointsx2","SD",true);
      Pizza_Coven.ShopImage = new Image("pics\\Pizza_Coven.jpg");
///////////////////////////////////////////////////////////////////////////////////////////////////
      //Potion
      Shop Draconic_Tonic = new Shop("Draconic_Tonic", "Potion", "Potion", "Gem", "Meat", "Iron","Potion","NA","Pointsx3","Pointsx2","SD",true);
      Draconic_Tonic.ShopImage = new Image("pics\\Draconic_Tonic.jpg");
      
      Shop Funky_Brewsters = new Shop("Funky_Brewsters", "Potion","Potion", "NA", "Meat", "Iron", "Wild", "NA","Pointsx3","SD","Pointsx2",true);
      Funky_Brewsters.ShopImage = new Image("pics\\Funky_Brewsters.jpg");
      
      Shop Potable_Potions = new Shop("Potable_Potions", "Potion","start","NA", "Potion", "Gem","Gem","NA","NA","Coin","SD",false);
      Potable_Potions.ShopImage = new Image("pics\\PotablePotions.jpg");
      
      Shop Spellfire_Springs = new Shop("Spellfire_Springs", "Potion","Plant", "Gem", "Potion", "NA","Wild", "NA","Pointsx3","SD","Coin",true);
      Spellfire_Springs.ShopImage = new Image("pics\\Spellfire_Springs.jpg");
////////////////////////////////////////////////////////////////////////////////////////////////// 
      //Gem     
      Shop Dragon_Hoard_Bank = new Shop("Dragon_Hoard_Bank", "Gem", "Iron","Gem","Iron","Gem","Wild", "NA","Pointsx3","Pointsx3","Pointsx2",true);
      Dragon_Hoard_Bank.ShopImage = new Image("pics\\Dragon_Hoard_Bank.jpg");
      
      Shop Fragile_Reptile = new Shop("Fragile_Reptile", "Gem","start","NA","Gem","Plant","Plant","NA","NA","Coin","SD",false);
      Fragile_Reptile.ShopImage = new Image("pics\\FragileReptile.jpg");
      
      Shop Tip_the_Scales = new Shop("Tip_the_Scales", "Gem", "Gem","NA","Iron","Plant","Wild", "NA","Pointsx3","SD","Pointsx2",true);
      Tip_the_Scales.ShopImage = new Image("pics\\Tip_the_Scales.jpg");
      
      Shop Touch_o_Glass = new Shop("Touch_o'_Glass", "Gem", "Breed", "Gem", "Meat", "Iron", "Gem", "NA","Pointsx3","Pointsx2","SD",true);
      Touch_o_Glass.ShopImage = new Image("pics\\Touch_o'_Glass.jpg");
/////////////////////////////////////////////////////////////////////////////////////////////////
      //Plant
      Shop Hedges_Henges = new Shop("Hedges_&_Henges", "Plant", "Iron","Potion","Plant", "NA","Wild","NA","Pointsx3","SD","Coin",true);
      Hedges_Henges.ShopImage = new Image("pics\\Hedges_&_Henges.jpg");
      
      Shop Hello_Nursery = new Shop("Hello_Nursery", "Plant","Start","NA","Plant","Breed","Breed","NA","NA","Coin","SD",false);
      Hello_Nursery.ShopImage = new Image("pics\\HelloNursery.jpg");
      
      Shop Oh_My_Gourd = new Shop("Oh_My_Gourd!", "Plant","Plant","NA","Meat","Gem","Wild","NA","Pointsx3","CoinX2","Pointsx2",true);
      Oh_My_Gourd.ShopImage = new Image("pics\\Oh_My_Gourd!.jpg");
      
      Shop Sage_of_Sage = new Shop("Sage_of_Sage", "Plant","Breed","Plant","Gem","Potion","Plant","NA","Pointsx3","Pointsx2","SD",true);
      Sage_of_Sage.ShopImage = new Image("pics\\Sage_of_Sage.jpg");
      
////////////////////////////////////////////////////////////////////////////////////////////////
      //Iron
      Shop SmithMart = new Shop("SmithMart", "Iron","Start","NA","Iron","Potion","Potion","NA","NA","Coin","SD",false);
      SmithMart.ShopImage = new Image("pics\\SmithMart.jpg");
      
      
      Shop Gnome_Depot = new Shop("Gnome_Depot", "Iron","Iron","NA","Plant","Meat","Wild","NA","Pointsx3","SD","Pointsx2",true);
      Gnome_Depot.ShopImage = new Image("pics\\Gnome_Depot.jpg");
      
      Shop Saving_Throw = new Shop("Saving_Throw", "Iron","Plant","Meat","Iron","NA","Wild","NA","Pointsx3","SD","Coin",true);
      Saving_Throw.ShopImage = new Image("pics\\Saving_Throw.jpg");
      
      Shop The_Savage_Beat = new Shop("The_Savage_Beat", "Iron","Iron","Potion","Breed","Meat","Iron","NA","Pointsx3","Pointsx2","SD",true);
      The_Savage_Beat.ShopImage = new Image("pics\\The_Savage_Beat.jpg");
      
///////////////////////////////////////////////////////////////////////////////////////////////  
      //Breed
      Shop Critical_Rolls = new Shop("Critical_Rolls", "Breed","Start","NA","Breed","Meat","Meat","NA","NA","Coin","SD",false);
      Critical_Rolls.ShopImage = new Image("pics\\CriticalRolls.jpg");
      
      Shop Drake_of_Cakes = new Shop("Drake_of_Cakes", "Breed","Breed","NA","Gem","Potion","Wild","NA","Pointsx3","SD","Pointsx2",true);
      Drake_of_Cakes.ShopImage = new Image("pics\\Drake_of_Cakes.jpg");
      
      Shop Guilty_Treasures = new Shop("Guilty_Treasures", "Breed","Breed","Iron","Plant","Potion","Breed","NA","CoinX2","CoinX2","CoinX2",true);
      Guilty_Treasures.ShopImage = new Image("pics\\Guilty_Treasures.jpg");
      
      //Shop La_Petite_Dragonne = new Shop("La_Petite_Dragonne", "Breed");
      //La_Petite_Dragonne.ShopImage = new Image("pics\\La_Petite_Dragonne.jpg");
///////////////////////////////////////////////////////////////////////////////////////////////
      //Wild      
      Shop Bizarre_Bazaar = new Shop("Bizarre_Bazaar", "wild","Breed","Potion","Wild","NA","Iron","Plant","Coin","SD","Coin",true);
      Bizarre_Bazaar.ShopImage = new Image("pics\\Bizarre_Bazaar.jpg");
      
      //Shop Eternal_Flame = new Shop("Eternal_Flame", "wild");
      //Eternal_Flame.ShopImage = new Image("pics\\Eternal_Flame.jpg");
      
      Shop Flagons_Dragons = new Shop("Flagons_&_Dragons ", "wild","Potion","Gem","Meat","Iron","Breed","Plant","Pointsx3","Coin","SD",true);
      Flagons_Dragons.ShopImage = new Image("pics\\Flagons_&_Dragons.jpg");
      
      Shop Nunyas_Beeswax = new Shop("Nunya's_Beeswaxr", "wild","Breed","Meat","Iron","Gem","Potion","Plant","Pointsx2","Pointsx2","Pointsx2",true);
      Nunyas_Beeswax.ShopImage = new Image("pics\\Nunya's_Beeswax.jpg");
      
      Shop Scale_Mail_Post = new Shop("Scale_Mail_Post", "wild","Iron","Gem","Plant","Meat","Breed","Potion","SD","Coin","SD",true);
      Scale_Mail_Post.ShopImage = new Image("pics\\Scale_Mail_Post.jpg");
      
//////////////////////////////////////////////////////////////////////////////////////////////
      //Dragon      
      //Shop Draggin_Tail_Roost = new Shop("Draggin'_Tail_Roost", "Dragon");
      //Draggin_Tail_Roost.ShopImage = new Image("pics\\Draggin'_Tail_Roost.jpg");
      
      Shop Sew_Cute = new Shop("Sew_Cute", "Dragon","Wild","NA","Wild","NA","Wild","NA","Pointsx3","Pointsx3","SD",true);
      Sew_Cute.ShopImage = new Image("pics\\Sew_Cute.jpg");
      
//////////////////////////////////////////////////////////////////////////////////////////////      
      //Coin
      //Shop Dragon_Alley = new Shop("Dragon_Alley", "Coin");
      //Dragon_Alley.ShopImage = new Image("pics\\Dragon_Alley.jpg");
      
      Shop Maw_Paws = new Shop("Maw_&_Paw's", "Coin","Meat","Gem","Potion","Iron","Plant","Breed","Pointsx3","Pointsx3","Pointsx3",true);
      Maw_Paws.ShopImage = new Image("pics\\Maw_&_Paw's.jpg");
      
      Shop Wishing_Well = new Shop("Wishing_Well", "CoinX3","Breed","Potion","Plant","Meat","Breed","Gem","Pointsx3","SD","Pointsx3",true);
      Wishing_Well.ShopImage = new Image("pics\\Wishing_Well.jpg");
      
//////////////////////////////////////////////////////////////////////////////////////////////////
      // Enchatmeants
      ArrayList<Enchant> EnchantArray = new ArrayList<Enchant>();
      
      Enchant Smelting_Pot = new Enchant("Smelting_Pot",3,1,0,0,2,0,"Iron","Pointsx6","Null","All");
      Smelting_Pot.EnchantImage = new Image("pics\\Smelting_Pot.jpg");
      EnchantArray.add(Smelting_Pot);
      
      Enchant Creme_Brulee = new Enchant("Creme_Brulee",0,3,0,1,0,2,"Breed","Pointsx6","Null","All");
      Creme_Brulee.EnchantImage = new Image("pics\\Creme_Brulee.jpg");
      EnchantArray.add(Creme_Brulee);
      
      Enchant Displacer_Beef = new Enchant("Displacer_Beef",0,0,2,3,0,0,"Meat","Pointsx4","Dragon","All");
      Displacer_Beef.EnchantImage = new Image("pics\\Displacer_Beef.jpg");
      EnchantArray.add(Displacer_Beef);
      
      Enchant Heart_Of_Flame = new Enchant("Heart_Of_Flame",0,3,0,0,0,2,"Gem","Pointsx4","Dragon","All");
      Heart_Of_Flame.EnchantImage = new Image("pics\\Heart_Of_Flame.jpg");
      EnchantArray.add(Heart_Of_Flame);
      
      Enchant Ring_Of_Destiny = new Enchant("Ring_Of_Destiny",2,0,1,0,0,3,"Gem","Pointsx6","Null","All");
      Ring_Of_Destiny.EnchantImage = new Image("pics\\Ring_Of_Destiny.jpg");
      EnchantArray.add(Ring_Of_Destiny);
      
      Enchant Le_Flamberge = new Enchant("Le_Flamberge",0,2,3,0,1,0,"Meat","Pointsx6","Null","All");
      Le_Flamberge.EnchantImage = new Image("pics\\Le_Flamberge.jpg");
      EnchantArray.add(Le_Flamberge);
      
      Enchant Dwarven_Stout = new Enchant("Dwarven_Stout",1,0,2,3,0,0,"Potions","Pointsx6","Null","All");
      Dwarven_Stout.EnchantImage = new Image("pics\\Dwarven_Stout.jpg");
      EnchantArray.add(Dwarven_Stout);
      
      Enchant Spell_Cast_Iron = new Enchant("Spell-Cast_Iron",2,0,0,0,0,3,"Iron","Pointsx4","Dragon","All");
      Spell_Cast_Iron.EnchantImage = new Image("pics\\Spell-Cast_Iron.jpg");
      EnchantArray.add(Spell_Cast_Iron);
      
      Enchant Fairys_Jubilee = new Enchant(" Fairys_Jubilee",3,2,0,0,0,0,"Breed","Pointsx4","Dragon","All");
      Fairys_Jubilee.EnchantImage = new Image("pics\\Fairys_Jubilee.jpg");
      EnchantArray.add(Fairys_Jubilee);
      
      Enchant Wraith_Rose = new Enchant("Wraith_Rose",0,0,0,2,3,2,"Plant","Pointsx6","Null","All");
      Wraith_Rose.EnchantImage = new Image("pics\\Wraith_Rose.jpg");
      EnchantArray.add(Wraith_Rose);
      
      Enchant Elfspresso = new Enchant("Elfspresso",0,0,0,2,3,0,"Potions","Pointsx6","Null","All");
      Elfspresso.EnchantImage = new Image("pics\\Elfspresso.jpg");
      EnchantArray.add(Elfspresso);
      
      Enchant Orkish_Orchids = new Enchant("Orkish_Orchids",0,0,3,0,2,0,"Plant","Pointsx6","Null","All");
      Orkish_Orchids.EnchantImage = new Image("pics\\Orkish_Orchids.jpg");
      EnchantArray.add(Orkish_Orchids);
      
      Enchant Mirror_Of_Truth = new Enchant("irror_Of_Truth",0,0,0,1,0,1,"Gem","Pointsx2","Null","Multi");
      Mirror_Of_Truth.EnchantImage = new Image("pics\\Mirror_Of_Truth.jpg");
      EnchantArray.add(Mirror_Of_Truth);
      
      Enchant Smoked_Gorgon = new Enchant("Smoked_Gorgon",0,0,1,0,0,1,"Meat","Pointsx2","Null","Multi");
      Smoked_Gorgon.EnchantImage = new Image("pics\\Smoked_Gorgon.jpg");
      EnchantArray.add(Smoked_Gorgon);
      
      Enchant Hobbichino = new Enchant("Hobbichino",0,1,0,1,0,0,"Potion","Pointsx2","Null","Multi");
      Hobbichino.EnchantImage = new Image("pics\\Hobbichino.jpg");
      EnchantArray.add(Hobbichino);
      
      Enchant Willow_Wisp = new Enchant("Willow_Wisp",1,0,0,0,1,0,"Plant","Pointsx2","Null","Multi");
      Willow_Wisp.EnchantImage = new Image("pics\\Willow_Wisp.jpg");
      EnchantArray.add(Willow_Wisp);
      
      Enchant Impanadas = new Enchant("Imp'anadas",0,1,0,0,1,0,"Breed","Pointsx2","Null","Multi");
      Impanadas.EnchantImage = new Image("pics\\Impanadas.jpg");
      EnchantArray.add(Impanadas);
      
      Enchant Joe_Forgeman = new Enchant("Joe_Forgeman",1,0,1,0,0,0,"Iron","Pointsx2","Null","Multi");
      Joe_Forgeman.EnchantImage = new Image("pics\\Joe_Forgeman.jpg");
      EnchantArray.add(Joe_Forgeman);
      
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
      //Shop locatios
      Shop Null = new Shop("Notthing here", "CoinX3","","","","","","","","","",false);
      Null.ShopImage = new Image("pics\\Shopback.jpg");
      
      Location location1 = new Location(SmithMart);
      
      Location location2 = new Location(Null);
      
      Location location3 = new Location(Critical_Rolls);
      
      Location location4 = new Location(Null);
      
      Location location5 = new Location(Draco_Bell);
      
      Location location6 = new Location(Null);
      
      Location location7 = new Location(Fragile_Reptile);
      
      Location location8 = new Location(Null);
      
      Location location9 = new Location(Hello_Nursery);
      
      Location location10 = new Location(Null);
      
      Location location11 = new Location(Potable_Potions);
      
      Location location12 = new Location(Null);
/////////////////////////////////////////////////////////////////////////////////////////////////      
      //Start dragons
      SmithMart.Dragon1 = Wingnut;
      
      
      Draco_Bell.Dragon1 = Hickory;
      
      
      Hello_Nursery.Dragon1 = Twig;
      
      
      Fragile_Reptile.Dragon1 = Brightgem;
      
      
      Critical_Rolls.Dragon1 = Pan;
      
      
      Potable_Potions.Dragon1 = Tannin;
      
      updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
/////////////////////////////////////////////////////////////////////////////////////////////////////      
      //Shop locations
      pane.add(location1.GetImage(), 1, 0);
      
      pane.add(location2.GetImage(), 2, 0);
      
      pane.add(location3.GetImage(), 3, 0);
      
      pane.add(location4.GetImage(), 4, 0);
      
      pane.add(location5.GetImage(), 5, 0);
      
      pane.add(location6.GetImage(), 6, 0);
      
      pane.add(location7.GetImage(), 1, 2);
      
      pane.add(location8.GetImage(), 2, 2);
      
      pane.add(location9.GetImage(), 3, 2);
      
      pane.add(location10.GetImage(), 4, 2);
      
      pane.add(location11.GetImage(), 5, 2);
      
      pane.add(location12.GetImage(), 6, 2);
/////////////////////////////////////////////////////////////////////////////////      
      //Park dragons
      dragon[] DragonArray = new dragon[]{Cinnabun, Cookie, Fondue, Honey, Loaf, Suzette, Earl, Elderberry, Jasmine, Lavender, Thistle, Venti, Cole, Flint, Patina, Roxanne, Rusty, Shale, Deathfang, Frostfire, Jewelheart, Moonbeam, Opalwing, Silverscale, Brisket, Cutlet, Flambe, Hot_Dog, Potato, Skewart, Blossom,  Dandelion, Herb, Lotus, Mulch, Olive};

      FlowPane ParkL = new FlowPane();
      FlowPane ParkD = new FlowPane();
      ParkL.getChildren().add(ParkD);
      Park DragonPark = new Park();
      DragonPark.ParkUpdate(ParkL, ParkD, DragonArray);
      pane.add(ParkL, 1, 4, 5, 1);
////////////////////////////////////////////////////////////////////////////////////////////
      //shop array      
      ArrayList<Shop> ShopArray = new ArrayList<Shop>();
      ShopArray.add(Wishing_Well);
      ShopArray.add(Maw_Paws);
      ShopArray.add(Sew_Cute);
      ShopArray.add(Scale_Mail_Post);
      ShopArray.add(Nunyas_Beeswax);
      ShopArray.add(Flagons_Dragons);
      ShopArray.add(Bizarre_Bazaar);
      ShopArray.add(Guilty_Treasures);
      ShopArray.add(Drake_of_Cakes);
      ShopArray.add(The_Savage_Beat);
      ShopArray.add(Saving_Throw);
      ShopArray.add(Gnome_Depot);
      ShopArray.add(Sage_of_Sage);
      ShopArray.add(Oh_My_Gourd);
      ShopArray.add(Hedges_Henges);
      ShopArray.add(Touch_o_Glass);
      ShopArray.add(Tip_the_Scales);
      ShopArray.add(Dragon_Hoard_Bank);
      ShopArray.add(Spellfire_Springs);
      ShopArray.add(Funky_Brewsters);
      ShopArray.add(Draconic_Tonic);
      ShopArray.add(Pizza_Coven);
      ShopArray.add(Full_Plate_Buffet);
      ShopArray.add(Fogo_de_Char);
//////////////////////////////////////////////////////////////////////////
      //hands      
      
      dragon hold = new dragon("hold", "hold");
      
      Hand Player1hand = new Hand(hold);
      //Player1hand.DragonHand[1] = hold;
      Hand Player2hand = new Hand(hold);
      //Player2hand.DragonHand[1] = hold;
      FlowPane HandL = new FlowPane();
      FlowPane HandD = new FlowPane();
      HandL.getChildren().add(HandD);
      
      Player1hand.HandDraw(DragonArray);
      Player2hand.HandDraw(DragonArray);
      Player1hand.HandDraw(DragonArray);
      Player2hand.HandDraw(DragonArray);
      Player1hand.HandUpdate(HandL, HandD);
      pane.add(HandL, 1, 9, 5, 1);
///////////////////////////////////////////////////////////////////////////
      //setup
      
      FlowPane EnchantL = new FlowPane();
      FlowPane EnchantD = new FlowPane();
      EnchantL.getChildren().add(EnchantD);
      pane.add(EnchantL, 1, 5,3,1);
      EnchantPark Enchanments = new EnchantPark();
      Enchanments.EnchantParkUpdate(EnchantL,EnchantD,EnchantArray);
      //pane.add(EnchantBack(), 1, 5);
      //pane.add(EnchantBack(), 2, 5);
      //pane.add(EnchantBack(), 3, 5);
      //pane.add(EnchantBack(), 4, 5);
      //pane.add(EnchantBack(), 5, 5);
      
      GridPane P1 = new GridPane();
      FlowPane FPP1 = new FlowPane();
      FPP1.getChildren().add(P1);
      pane.add(FPP1, 1, 6, 2, 2);
      UpdateP1(FPP1, P1);
      
      GridPane P2 = new GridPane();
      FlowPane FPP2 = new FlowPane();
      pane.add(FPP2, 5, 6, 2, 2);
      UpdateP2(FPP2, P2);
      
      TextArea taInfo = new TextArea("");
      pane.add(taInfo, 3, 6, 2, 2);
      Button[] Buttons = new Button[12];
      Buttons[0] = new Button("1");
      Buttons[1] = new Button("2");
      Buttons[2] = new Button("3");
      Buttons[3] = new Button("4");
      Buttons[4] = new Button("5");
      Buttons[5] = new Button("6");
      Buttons[6] = new Button("7");
      Buttons[7] = new Button("8");
      Buttons[8] = new Button("9");
      Buttons[9] = new Button("10");
      Buttons[10] = new Button("11");
      Buttons[11] = new Button("12");
      
       FlowPane btnPane = new FlowPane();
       btnPane.getChildren().addAll(Buttons[0], Buttons[1], Buttons[2], Buttons[3], Buttons[4], Buttons[5], Buttons[6], Buttons[7], Buttons[8], Buttons[9], Buttons[10], Buttons[11]);
       pane.add(btnPane, 3, 8, 2,2);
/////////////////////////////////////////////////////////////////////////////////////////////////////////
      //Buttons       
       Buttons[0].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
           if (Stage == "start")
           {
           gather1(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather1"){
           location1.shop.Gather();
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
               gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather2"){
            SlotHold = 1;
            PlaceDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
           }
           else if (Stage == "gather3"){
            DragonHold = 1;
            setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "gather4"){
            DragonFire = 1;
            FireStart(taInfo,Buttons,Player1hand,Player2hand,DragonPark,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10, location11,location12);
           }
           else if (Stage == "Breed1"){
           BreedDragonHand(taInfo,Buttons,Player1hand,Player2hand,DragonPark,HandL,HandD,DragonArray, Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6,Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,FPP1, P1, FPP2, P2,ShopArray,ParkL, ParkD);
           }
           else if (Stage == "Breed2"){
           DragonHold = 1;
           BreedDrawPark(taInfo,Buttons,Player1hand,Player2hand,DragonPark,HandL,HandD,ParkL,ParkD,DragonArray,FPP1, P1, FPP2, P2, location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Plant"){
            DragonHold = 1;
            PlantDragon(FPP1,P1,FPP2,P2,taInfo,location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD,DragonArray, DragonPark,Buttons);
           }
           else if (Stage == "Meat"){
           MeatDragonHold = location1;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Meat1"){
            SlotHold = 1;
            MeatPlaceDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
           }
           else if (Stage == "Meat2"){
            DragonHold = 1;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Iron"){
            DragonIron = 1;
            IronDragon2(location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,FPP1,P1,FPP2,P2,taInfo,Buttons);
           }
           else if (Stage == "Gem"){
           Buttons[0].setDisable(true);
           if (player == 1){
           P1Breed =  P1Breed + 1;
           }
           if (player == 2){
           P2Breed =  P2Breed + 1;
           }
           GemDragon2(taInfo,Buttons);
           }
           else if (Stage == "Gem1"){
           Buttons[0].setDisable(true);
           if (player == 1){
           P1Breed =  P1Breed + 1;
           }
           if (player == 2){
           P2Breed =  P2Breed + 1;
           }
           GemDragon3(taInfo,Buttons);
           }
           else if (Stage == "Gem2"){
           Buttons[0].setDisable(true);
           if (player == 1){
           P1Breed =  P1Breed + 1;
           }
           if (player == 2){
           P2Breed =  P2Breed + 1;
           }
           UpdateP2(FPP2, P2);
           UpdateP1(FPP1, P1);
           UseShop(taInfo, Buttons);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location1;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Potion1"){
           DragonPotion = 1;
           PotionDragonHold2 = PotionDragonLocationHold.shop.Dragon1;
           PotionDragon3(taInfo, Buttons,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,DragonPark);
           }
            else if (Stage == "ShopA"){
            
            }
            else if (Stage == "End"){
            if (player == 1){
           Player1hand.HandUpdate(HandL, HandD);
           }
           if (player == 2){
           Player2hand.HandUpdate(HandL, HandD);
           }
            start(taInfo,Buttons);
            }
            else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
            else if (Stage == "Enchant2"){
            EnchantCheck1(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,HandL,HandD,DragonArray);
            EnchantHold = 1;
            }
            else if (Stage == "EnchantMulti"){
            EnchantMultiHold = 1;
            EnchantMultiCheck(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12, Enchanments,Player1hand,Player2hand,HandL,HandD,DragonArray);
            
            }
            else if (Stage == "EnchantEnd"){
            EndGame(taInfo, FPP1, P1, FPP2, P2, location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD,DragonArray, DragonPark, pane,EnchantL, EnchantD,EnchantArray,Enchanments,Buttons);//Here
            }
      }
      });

         Buttons[1].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location2.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location2;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location2;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather2"){
           SlotHold = 2;
           PlaceDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
           }
           else if (Stage == "gather3"){
           DragonHold = 2;
           setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "gather4"){
           DragonFire = 2;
           FireStart(taInfo,Buttons,Player1hand,Player2hand,DragonPark,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10, location11,location12);
           }
           else if (Stage == "Breed1"){
           BreedDragonPark(taInfo,Buttons,DragonPark);
           }
           else if (Stage == "Breed2"){
           DragonHold = 2;
           BreedDrawPark(taInfo,Buttons,Player1hand,Player2hand,DragonPark,HandL,HandD,ParkL,ParkD,DragonArray,FPP1, P1, FPP2, P2, location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Plant"){
            DragonHold = 2;
            PlantDragon(FPP1,P1,FPP2,P2,taInfo,location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD,DragonArray, DragonPark,Buttons);
           }
           else if (Stage == "Meat"){
           MeatDragonHold = location2;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Meat1"){
            SlotHold = 2;
            MeatPlaceDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
           }
            else if (Stage == "Meat2"){
            DragonHold = 2;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Iron"){
            DragonIron = 2;
            IronDragon2(location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,FPP1,P1,FPP2,P2,taInfo,Buttons);
           }
           else if (Stage == "Gem"){
           Buttons[1].setDisable(true);
           if (player == 1){
           P1Meat =  P1Meat + 1;
           }
           if (player == 2){
           P2Meat =  P2Meat + 1;
           }
           GemDragon2(taInfo,Buttons);
           }
           else if (Stage == "Gem1"){
           Buttons[1].setDisable(true);
           if (player == 1){
           P1Meat =  P1Meat + 1;
           }
           if (player == 2){
           P2Meat =  P2Meat + 1;
           }
           GemDragon3(taInfo,Buttons);
           }
           else if (Stage == "Gem2"){
           Buttons[1].setDisable(true);
           if (player == 1){
           P1Meat =  P1Meat + 1;
           }
           if (player == 2){
           P2Meat =  P2Meat + 1;
           }
           UpdateP2(FPP2, P2);
           UpdateP1(FPP1, P1);
           UseShop(taInfo, Buttons);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location2;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Potion1"){
           DragonPotion = 2;
           PotionDragonHold2 = PotionDragonLocationHold.shop.Dragon2;
           PotionDragon3(taInfo, Buttons,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,DragonPark);
           }
           else if (Stage == "ShopA"){
            EndGame(taInfo, FPP1, P1, FPP2, P2, location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD,DragonArray, DragonPark, pane,EnchantL, EnchantD,EnchantArray,Enchanments,Buttons);
            }
            else if (Stage == "start"){
            Enchant1(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
            }
            else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
            else if (Stage == "Enchant2"){
            EnchantCheck1(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,HandL,HandD,DragonArray);
            EnchantHold = 2;
            }
            else if (Stage == "EnchantMulti"){
            EnchantMultiHold = 2;
            EnchantMultiCheck(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12, Enchanments,Player1hand,Player2hand,HandL,HandD,DragonArray);
            
            }
         }
      });

         Buttons[2].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location3.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location3;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location3;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather2"){
           SlotHold = 3;
           PlaceDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
           }
           else if (Stage == "gather3"){
           DragonHold = 3;
           setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "gather4"){
           DragonFire = 3;
           FireStart(taInfo,Buttons,Player1hand,Player2hand,DragonPark,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10, location11,location12);
           }
           else if (Stage == "Breed2"){
           DragonHold = 3;
           BreedDrawPark(taInfo,Buttons,Player1hand,Player2hand,DragonPark,HandL,HandD,ParkL,ParkD,DragonArray,FPP1, P1, FPP2, P2, location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Plant"){
            DragonHold = 3;
            PlantDragon(FPP1,P1,FPP2,P2,taInfo,location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD,DragonArray, DragonPark,Buttons);
           }
           else if (Stage == "Meat"){
           MeatDragonHold = location3;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Meat1"){
            SlotHold = 3;
            MeatPlaceDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
           }
            else if (Stage == "Meat2"){
            DragonHold = 3;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Iron"){
            DragonIron = 3;
            IronDragon2(location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,FPP1,P1,FPP2,P2,taInfo,Buttons);
           }
           else if (Stage == "Gem"){
           Buttons[2].setDisable(true);
           if (player == 1){
           P1Potion =  P1Potion + 1;
           }
           if (player == 2){
           P2Potion =  P2Potion + 1;
           }
           GemDragon2(taInfo,Buttons);
           }
           else if (Stage == "Gem1"){
           Buttons[2].setDisable(true);
           if (player == 1){
           P1Potion =  P1Potion + 1;
           }
           if (player == 2){
           P2Potion =  P2Potion + 1;
           }
           GemDragon3(taInfo,Buttons);
           }
           else if (Stage == "Gem2"){
           Buttons[2].setDisable(true);
           if (player == 1){
           P1Potion =  P1Potion + 1;
           }
           if (player == 2){
           P2Potion =  P2Potion + 1;
           }
           UpdateP2(FPP2, P2);
           UpdateP1(FPP1, P1);
           UseShop(taInfo, Buttons);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location3;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Potion1"){
           DragonPotion = 3;
           PotionDragonHold2 = PotionDragonLocationHold.shop.Dragon3;
           PotionDragon3(taInfo, Buttons,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,DragonPark);
           }
           else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
            else if (Stage == "Enchant2"){
            EnchantCheck1(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,HandL,HandD,DragonArray);
            EnchantHold = 3;
            }
            else if (Stage == "EnchantMulti"){
            EnchantMultiHold = 3;
            EnchantMultiCheck(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12, Enchanments,Player1hand,Player2hand,HandL,HandD,DragonArray);
            
            }
         }
      });

         Buttons[3].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location4.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location4;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location4;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather3"){
           DragonHold = 4;
           setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "Breed2"){
           DragonHold = 4;
           BreedDrawPark(taInfo,Buttons,Player1hand,Player2hand,DragonPark,HandL,HandD,ParkL,ParkD,DragonArray,FPP1, P1, FPP2, P2, location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Plant"){
            DragonHold = 4;
            PlantDragon(FPP1,P1,FPP2,P2,taInfo,location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD,DragonArray, DragonPark,Buttons);           
            }
           else if (Stage == "Meat"){
           MeatDragonHold = location4;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
            else if (Stage == "Meat1"){
            DragonHold = 4;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Iron"){
            DragonIron = 4;
            IronDragon2(location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,FPP1,P1,FPP2,P2,taInfo,Buttons);
           }
           else if (Stage == "Gem"){
           Buttons[3].setDisable(true);
           if (player == 1){
           P1Iron =  P1Iron + 1;
           }
           if (player == 2){
           P2Iron =  P2Iron + 1;
           }
           GemDragon2(taInfo,Buttons);
           }
           else if (Stage == "Gem1"){
           Buttons[3].setDisable(true);
           if (player == 1){
           P1Iron =  P1Iron + 1;
           }
           if (player == 2){
           P2Iron =  P2Iron + 1;
           }
           GemDragon3(taInfo,Buttons);
           }
           else if (Stage == "Gem2"){
           Buttons[3].setDisable(true);
           if (player == 1){
           P1Iron =  P1Iron + 1;
           }
           if (player == 2){
           P2Iron =  P2Iron + 1;
           }
           UpdateP2(FPP2, P2);
           UpdateP1(FPP1, P1);
           UseShop(taInfo, Buttons);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location4;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
            else if (Stage == "Enchant2"){
            EnchantCheck1(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,HandL,HandD,DragonArray);
            EnchantHold = 4;
            }
            else if (Stage == "EnchantMulti"){
            EnchantMultiHold = 4;
            EnchantMultiCheck(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12, Enchanments,Player1hand,Player2hand,HandL,HandD,DragonArray);
            
            }
         }
      });
      Buttons[4].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location5.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location5;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location5;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather3"){
           DragonHold = 5;
           setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "Breed2"){
           DragonHold = 5;
           BreedDrawPark(taInfo,Buttons,Player1hand,Player2hand,DragonPark,HandL,HandD,ParkL,ParkD,DragonArray,FPP1, P1, FPP2, P2, location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Plant"){
            DragonHold = 5;
            PlantDragon(FPP1,P1,FPP2,P2,taInfo,location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD,DragonArray, DragonPark,Buttons);
                       }
           else if (Stage == "Meat"){
           MeatDragonHold = location5;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
            else if (Stage == "Meat1"){
            DragonHold = 5;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Gem"){
           Buttons[4].setDisable(true);
           if (player == 1){
           P1Gems =  P1Gems + 1;
           }
           if (player == 2){
           P2Gems =  P2Gems + 1;
           }
           GemDragon2(taInfo,Buttons);
           }
           else if (Stage == "Gem1"){
           Buttons[4].setDisable(true);
           if (player == 1){
           P1Gems =  P1Gems + 1;
           }
           if (player == 2){
           P2Gems =  P2Gems + 1;
           }
           GemDragon3(taInfo,Buttons);
           }
           else if (Stage == "Gem2"){
           Buttons[4].setDisable(true);
           if (player == 1){
           P1Gems =  P1Gems + 1;
           }
           if (player == 2){
           P2Gems =  P2Gems + 1;
           }
           UpdateP2(FPP2, P2);
           UpdateP1(FPP1, P1);
           UseShop(taInfo, Buttons);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location5;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
            else if (Stage == "Enchant2"){
           EnchantCheck1(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,HandL,HandD,DragonArray);            
           EnchantHold = 5;
            }
         }
      });
      Buttons[5].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location6.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location6;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location6;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather3"){
           DragonHold = 6;
           setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "Plant"){
            DragonHold = 6;
            PlantDragon(FPP1,P1,FPP2,P2,taInfo,location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12, ShopArray, ParkL, ParkD,DragonArray, DragonPark,Buttons);           
            }
           else if (Stage == "Meat"){
           MeatDragonHold = location6;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
            else if (Stage == "Meat1"){
            DragonHold = 6;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Gem"){
           Buttons[5].setDisable(true);
           if (player == 1){
           P1Plants =  P1Plants + 1;
           }
           if (player == 2){
           P2Plants =  P2Plants + 1;
           }
           GemDragon2(taInfo,Buttons);
           }
           else if (Stage == "Gem1"){
           Buttons[5].setDisable(true);
           if (player == 1){
           P1Plants =  P1Plants + 1;
           }
           if (player == 2){
           P2Plants =  P2Plants + 1;
           }
           GemDragon3(taInfo,Buttons);
           }
           else if (Stage == "Gem2"){
           Buttons[5].setDisable(true);
           if (player == 1){
           P1Plants =  P1Plants + 1;
           }
           if (player == 2){
           P2Plants =  P2Plants + 1;
           }
           UpdateP2(FPP2, P2);
           UpdateP1(FPP1, P1);
           UseShop(taInfo, Buttons);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location6;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
            
         }
      });
      Buttons[6].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location7.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location7;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location7;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather3"){
           DragonHold = 7;
           setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "Meat"){
           MeatDragonHold = location7;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
            else if (Stage == "Meat1"){
            DragonHold = 7;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location7;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
            
         }
      });
      Buttons[7].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location8.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location8;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location8;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather3"){
           DragonHold = 8;
           setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "Meat"){
           MeatDragonHold = location8;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
            else if (Stage == "Meat1"){
            DragonHold = 8;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1,FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location8;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
            
         }
      });
      Buttons[8].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location9.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location9;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location9;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather3"){
           DragonHold = 9;
           setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "Meat"){
           MeatDragonHold = location9;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
            else if (Stage == "Meat1"){
            DragonHold = 9;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location9;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
            
         }
      });
      Buttons[9].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location10.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location10;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location10;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather3"){
           DragonHold = 10;
           setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "Meat"){
           MeatDragonHold = location10;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
            else if (Stage == "Meat1"){
            DragonHold = 10;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location10;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            
         }
      });
      Buttons[10].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location11.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location11;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location11;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }else if (Stage == "gather3"){
           DragonHold = 11;
           setDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2);
           }
           else if (Stage == "Meat"){
           MeatDragonHold = location11;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
            else if (Stage == "Meat1"){
            DragonHold = 11;
            MeatsetDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand,HandL ,HandD,Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,FPP1,P1, FPP2,P2,ShopArray, ParkL, ParkD);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location11;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
            Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
            
         }
      });
      Buttons[11].setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
         if (Stage == "gather1"){
           location12.shop.Gather();
           if (player == 1){
           UpdateP1(FPP1,P1);
           player1location = location12;
           }
           else if (player == 2){
           UpdateP2(FPP2,P2);
           player2location = location12;
           }
           gather2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather2" ||Stage == "gather3"){
           fireDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "gather4"){
           UseShop(taInfo,Buttons);
           }
           else if (Stage == "Meat"){
           MeatDragonHold = location12;
           MeatDragonPlace(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Meat1" || Stage == "Meat2" ){
            UseShop(taInfo,Buttons);
           }
           else if (Stage == "Potion"){
           PotionDragonLocationHold = location12;
           PotionDragon2(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
           }
           else if (Stage == "Enchant1"){
            if (player == 1){
               UpdateP1(FPP1,P1);
               player1location = location1;
               }
            else if (player == 2){
               UpdateP2(FPP2,P2);
               player2location = location1;
               }
             Enchant2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            
            }
         }
      });
      
   
   Scene scene = new Scene(pane);
      primaryStage.setTitle("FlameCraft");
      primaryStage.setScene(scene);
      primaryStage.show();
      
      start(taInfo,Buttons);

   }
   public static void main(String[] args) { 
    launch(args);
   }
/////////////////////////////////////////////////////////////////////////////////////////////////////   
   // update items
   private void UpdateP1(FlowPane FPP1, GridPane P1){
   FPP1.getChildren().clear();
   P1 = new GridPane();
   P1.add(new Label("Player 1"), 1, 0);
      P1.add(new Label("Breed: "  + P1Breed), 1, 1);
      P1.add(new Label("Meat: " + P1Meat), 1, 2);
      P1.add(new Label("potion: " + P1Potion), 1, 3);
      P1.add(new Label("Iron: " + P1Iron), 1, 4);
      P1.add(new Label("Gems: " + P1Gems), 1, 5);
      P1.add(new Label("Plants: " + P1Plants), 1, 6);
      P1.add(new Label("coins: "  + P1Coins), 1, 7);
      P1.add(new Label("Points: "  + P1Points), 1, 8);
      FPP1.getChildren().add(P1);
   }
   /////
   private void UpdateP2(FlowPane FPP2, GridPane P2){
   FPP2.getChildren().clear();
   P2 = new GridPane();
   P2.add(new Label("Player 2"), 1, 0);
      P2.add(new Label("Breed: " + P2Breed), 1, 1);
      P2.add(new Label("Meat: " + P2Meat), 1, 2);
      P2.add(new Label("potion: " + P2Potion), 1, 3);
      P2.add(new Label("Iron: " + P2Iron), 1, 4);
      P2.add(new Label("Gems: " + P2Gems), 1, 5);
      P2.add(new Label("Plants: " + P2Plants), 1, 6);
      P2.add(new Label("coins: " + P2Coins), 1, 7);
      P2.add(new Label("Points: "  + P2Points), 1, 8);
      FPP2.getChildren().add(P2);
   }
///////////////////////////////////////////////////////////////////////////
   //Rules
   public ImageView Rules2(){
   Image image = new Image("pics\\Rules2.jpg");
   ImageView imageView = new ImageView(image);
    //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(400); 
      imageView.setFitWidth(400); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
      
      //Creating a Group object  
      //Group root = new Group(imageView);
      return imageView;
      }
      
      public ImageView Rules1(){
      Image image = new Image("pics\\Rules1.jpg");
      ImageView imageView = new ImageView(image);
      //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(400); 
      imageView.setFitWidth(400); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
      
      //Creating a Group object  
      //Group root = new Group(imageView);
      return imageView;
   }
///////////////////////////////////////////////////////////////////////////////////////////////
      //Dragons
   public ImageView DragonBack(){
   Image image = new Image("pics\\DragonBack.jpg");
   ImageView imageView = new ImageView(image);
    //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(100); 
      imageView.setFitWidth(100); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
      
      //Creating a Group object  
      //Group root = new Group(imageView);
      return imageView;
      }
   //Enchanments
   public ImageView EnchantBack(){
   Image image = new Image("pics\\EnchantBack.jpg");
   ImageView imageView = new ImageView(image);
    //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(100); 
      imageView.setFitWidth(100); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
      
      //Creating a Group object  
      //Group root = new Group(imageView);
      
      return imageView;
      }
////////////////////////////////////////////////////////////////////////////////////////////
      //truns
      private String Stage = "start";
      private void start(TextArea taInfo, Button[] Buttons)
      {
      Stage = "start";
      taInfo.setText("Pick a mode \r\n1)Gather \r\n2)Enchat");
      Buttons[0].setDisable(false);
      Buttons[1].setDisable(false);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
      }
      
      //gather
      private void gather1(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12){
      Stage = "gather1";
      taInfo.setText("Pick a shop \r\n1)" + location1.shop.ShopName + 
      "\r\n2)" + location2.shop.ShopName + 
      "\r\n3)" + location3.shop.ShopName + 
      "\r\n4)" + location4.shop.ShopName + 
      "\r\n5)" + location5.shop.ShopName + 
      "\r\n6)" + location6.shop.ShopName + 
      "\r\n7)" + location7.shop.ShopName +
      "\r\n8)" + location8.shop.ShopName + 
      "\r\n9)" + location9.shop.ShopName + 
      "\r\n10)" + location10.shop.ShopName + 
      "\r\n11)" + location11.shop.ShopName +
      "\r\n12)" + location12.shop.ShopName);
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
      if (location1.shop.ShopName != "Notthing here")
      {
      Buttons[0].setDisable(false);
      }
      if (location2.shop.ShopName != "Notthing here")
      {
      Buttons[1].setDisable(false);
      }
      if (location3.shop.ShopName != "Notthing here")
      {
      Buttons[2].setDisable(false);
      }
      if (location4.shop.ShopName != "Notthing here")
      {
      Buttons[3].setDisable(false);
      }
      if (location5.shop.ShopName != "Notthing here")
      {
      Buttons[4].setDisable(false);
      }
      if (location6.shop.ShopName != "Notthing here")
      {
      Buttons[5].setDisable(false);
      }
      if (location7.shop.ShopName != "Notthing here")
      {
      Buttons[6].setDisable(false);
      }
      if (location8.shop.ShopName != "Notthing here")
      {
      Buttons[7].setDisable(false);
      }
      if (location9.shop.ShopName != "Notthing here")
      {
      Buttons[8].setDisable(false);
      }
      if (location10.shop.ShopName != "Notthing here")
      {
      Buttons[9].setDisable(false);
      }
      if (location11.shop.ShopName != "Notthing here")
      {
      Buttons[10].setDisable(false);
      }
      if (location12.shop.ShopName != "Notthing here")
      {
      Buttons[11].setDisable(false);
      }
      
      }
      private void gather2(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12)
      {
      Stage = "gather2";
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(false);
      if(player == 1){
      taInfo.setText("place a dragon \r\n1) Slot 1:"+ player1location.shop.slot1Type1 + "/" + player1location.shop.slot1Type2 + "\r\n2) Slot 2:"+ player1location.shop.slot2Type1 + "/" + player1location.shop.slot2Type2 +"\r\n3) Slot 3:"+ player1location.shop.slot3Type1 + "/" + player1location.shop.slot3Type2 + "\r\n12)Skip placeing dragon");
      if(player1location.shop.Dragon1 == null)
      {
      Buttons[0].setDisable(false);
      }
      if(player1location.shop.Dragon2 == null)
      {
      Buttons[1].setDisable(false);
      }
      if(player1location.shop.Dragon3 == null)
      {
      Buttons[2].setDisable(false);
      }
      }
      if(player == 2){
      taInfo.setText("place a dragon \r\n1) Slot 1: "+ player2location.shop.slot1Type1 + "/" + player2location.shop.slot1Type2 + "\r\n2) Slot 2: "+ player2location.shop.slot2Type1 + "/" + player2location.shop.slot2Type2 +"\r\n3) Slot 3: "+ player2location.shop.slot3Type1 + "/" + player2location.shop.slot3Type2+ "\r\n12)Skip placeing dragon");
      if(player2location.shop.Dragon1 == null)
      {
      Buttons[0].setDisable(false);
      }
      if(player2location.shop.Dragon2 == null)
      {
      Buttons[1].setDisable(false);
      }
      if(player2location.shop.Dragon3 == null)
      {
      Buttons[2].setDisable(false);
      }
      }
      }
      
      private void PlaceDragon(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, Hand Player1hand,Hand Player2hand){
      Stage = "gather3";
      String hold = "Pick a dragon to place";
      int test = 0;
      if(player == 1){
      for (dragon d : Player1hand.DragonHand) {
      hold +="\r\n" + test +")" + d.DragonsName;
      test= test+1;
      }
      hold = hold + "\r\n12)Skip placeing dragon";
      hold = hold.replace("\r\n0)hold","");
      taInfo.setText(hold);
      for(int I=0; I<Buttons.length; ++I)
      {
      Buttons[I].setDisable(true);
      }
      for(int I = 1; I < test; ++I)
      {
      Buttons[I-1].setDisable(false);
      }
      Buttons[11].setDisable(false);
      }
      if(player == 2){
      for (dragon d : Player2hand.DragonHand) {
      hold +="\r\n" + test +")" + d.DragonsName;
      test= test+1;
      }
      hold = hold + "\r\n12)Skip placeing dragon";
      hold = hold.replace("\r\n0)hold","");
      taInfo.setText(hold);
      for(int I=0; I<Buttons.length; ++I)
      {
      Buttons[I].setDisable(true);
      }
      for(int I = 1; I < test; ++I)
      {
      Buttons[I-1].setDisable(false);
      }
      Buttons[11].setDisable(false);
      }      }
      private void PlaceDragonError(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, Hand Player1hand,Hand Player2hand){
      Stage = "gather3";
      String hold = "That dragon can not be placed there\r\nPick a dragon to place";
      int test = 0;
      if(player == 1){
      for (dragon d : Player1hand.DragonHand) {
      hold +="\r\n" + test +")" + d.DragonsName;
      test= test+1;
      }
      hold = hold + "\r\n12)Skip placeing dragon";
      hold = hold.replace("\r\n0)hold","");
      taInfo.setText(hold);
      for(int I=0; I<Buttons.length; ++I)
      {
      Buttons[I].setDisable(true);
      }
      for(int I = 1; I < test; ++I)
      {
      Buttons[I-1].setDisable(false);
      }
      Buttons[11].setDisable(false);
      }
      if(player == 2){
      for (dragon d : Player2hand.DragonHand) {
      hold +="\r\n" + test +")" + d.DragonsName;
      test= test+1;
      }
      hold = hold + "\r\n12)Skip placeing dragon";
      hold = hold.replace("\r\n0)hold","");
      taInfo.setText(hold);
      for(int I=0; I<Buttons.length; ++I)
      {
      Buttons[I].setDisable(true);
      }
      for(int I = 1; I < test; ++I)
      {
      Buttons[I-1].setDisable(false);
      }
      Buttons[11].setDisable(false);
      }
      }
      boolean DidIt = false;
      
      private void setDragon(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, Hand Player1hand,Hand Player2hand,
      FlowPane HandL ,FlowPane HandD, FlowPane Shop1,FlowPane Shop1D,FlowPane Shop2, FlowPane Shop2D,FlowPane Shop3, FlowPane Shop3D,FlowPane Shop4, FlowPane Shop4D,FlowPane Shop5, FlowPane Shop5D,FlowPane Shop6, FlowPane Shop6D,FlowPane Shop7, FlowPane Shop7D,FlowPane Shop8, FlowPane Shop8D,FlowPane Shop9, FlowPane Shop9D,FlowPane Shop10, FlowPane Shop10D,FlowPane Shop11, FlowPane Shop11D,FlowPane Shop12, FlowPane Shop12D, FlowPane FPP1, GridPane P1, FlowPane FPP2, GridPane P2){
      {
      DidIt = false;
      if (player == 1)
      {
      dragon Hold = Player1hand.DragonHand.get(DragonHold);
      
      if (SlotHold == 1){
         if (player1location.shop.slot1Type1 == Hold.DragonsType || player1location.shop.slot1Type2 == Hold.DragonsType || player1location.shop.slot1Type2 == "Wild" || player1location.shop.slot1Type2 == "Wild")
         {
         Player1hand.DragonHand.remove(DragonHold);
         player1location.shop.Dragon1 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player1hand.HandUpdate(HandL, HandD);
         
         if (player1location.shop.slot1reword == "Coin"){
         P1Coins = P1Coins + 1;
         }
         if (player1location.shop.slot1reword == "Coinx2"){
         P1Coins = P1Coins + 2;
         }
         if (player1location.shop.slot1reword == "SD"){
         //Draw Special  dragon
         }
         if (player1location.shop.slot1reword == "Pointsx2"){
         P1Points = P1Points + 2;
         }
         if (player1location.shop.slot1reword == "Pointsx3"){
         P1Points = P1Points + 3;
         }
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }

      }
            if (SlotHold == 2){
         if (player1location.shop.slot2Type1 == Hold.DragonsType || player1location.shop.slot2Type2 == Hold.DragonsType || player1location.shop.slot2Type2 == "Wild" || player1location.shop.slot2Type2 == "Wild")
         {
         Player1hand.DragonHand.remove(DragonHold);
         player1location.shop.Dragon2 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player1hand.HandUpdate(HandL, HandD);
         if (player1location.shop.slot2reword == "Coin"){
         P1Coins = P1Coins + 1;
         }
         if (player1location.shop.slot2reword == "Coinx2"){
         P1Coins = P1Coins + 2;
         }
         if (player1location.shop.slot2reword == "SD"){
         //Draw Special  dragon
         }
         if (player1location.shop.slot2reword == "Pointsx2"){
         P1Points = P1Points + 2;
         }
         if (player1location.shop.slot2reword == "Pointsx3"){
         P1Points = P1Points + 3;
         }
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }

      }
      
      if (SlotHold == 3){
         if (player1location.shop.slot3Type1 == Hold.DragonsType || player1location.shop.slot3Type2 == Hold.DragonsType || player1location.shop.slot3Type2 == "Wild" || player1location.shop.slot3Type2 == "Wild"){
         Player1hand.DragonHand.remove(DragonHold);
         player1location.shop.Dragon3 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player1hand.HandUpdate(HandL, HandD);
         if (player1location.shop.slot3reword == "Coin"){
         P1Coins = P1Coins + 1;
         }
         if (player1location.shop.slot3reword == "Coinx2"){
         P1Coins = P1Coins + 2;
         }
         if (player1location.shop.slot3reword == "SD"){
         //Draw Special  dragon
         }
         if (player1location.shop.slot3reword == "Pointsx2"){
         P1Points = P1Points + 2;
         }
         if (player1location.shop.slot3reword == "Pointsx3"){
         P1Points = P1Points + 3;
         }
         DidIt = true;
         
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }

      }
      
      }
      if (player == 2){
      dragon Hold = Player2hand.DragonHand.get(DragonHold);
      
      if (SlotHold == 1){
         if (player2location.shop.slot1Type1 == Hold.DragonsType || player2location.shop.slot1Type2 == Hold.DragonsType || player2location.shop.slot1Type2 == "Wild" || player2location.shop.slot1Type2 == "Wild")
         {
         Player2hand.DragonHand.remove(DragonHold);
         player2location.shop.Dragon1 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player2hand.HandUpdate(HandL, HandD);
         if (player2location.shop.slot1reword == "Coin"){
         P2Coins = P2Coins + 1;
         }
         if (player2location.shop.slot1reword == "Coinx2"){
         P2Coins = P2Coins + 2;
         }
         if (player1location.shop.slot1reword == "SD"){
         //Draw Special  dragon
         }
         if (player2location.shop.slot1reword == "Pointsx2"){
         P2Points = P2Points + 2;
         }
         if (player2location.shop.slot1reword == "Pointsx3"){
         P2Points = P2Points + 3;
         }
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }

      }
      
      if (SlotHold == 2){
         if (player2location.shop.slot2Type1 == Hold.DragonsType || player2location.shop.slot2Type2 == Hold.DragonsType || player2location.shop.slot2Type2 == "Wild" || player2location.shop.slot2Type2 == "Wild")
         {
         Player2hand.DragonHand.remove(DragonHold);
         player2location.shop.Dragon2 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player2hand.HandUpdate(HandL, HandD);
         if (player2location.shop.slot2reword == "Coin"){
         P2Coins = P2Coins + 1;
         }
         if (player2location.shop.slot2reword == "Coinx2"){
         P2Coins = P2Coins + 2;
         }
         if (player1location.shop.slot2reword == "SD"){
         //Draw Special  dragon
         }
         if (player2location.shop.slot2reword == "Pointsx2"){
         P2Points = P2Points + 2;
         }
         if (player2location.shop.slot2reword == "Pointsx3"){
         P2Points = P2Points + 3;
         }
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }
      }
      
      if (SlotHold == 3){
         if (player2location.shop.slot3Type1 == Hold.DragonsType || player2location.shop.slot3Type2 == Hold.DragonsType || player2location.shop.slot3Type2 == "Wild" || player2location.shop.slot3Type2 == "Wild")
         {
         Player2hand.DragonHand.remove(DragonHold);
         player2location.shop.Dragon3 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player2hand.HandUpdate(HandL, HandD);
         if (player2location.shop.slot3reword == "Coin"){
         P2Coins = P2Coins + 1;
         }
         if (player2location.shop.slot3reword == "Coinx2"){
         P2Coins = P2Coins + 2;
         }
         if (player1location.shop.slot3reword == "SD"){
         //Draw Special  dragon
         }
         if (player2location.shop.slot3reword == "Pointsx2"){
         P2Points = P2Points + 2;
         }
         if (player2location.shop.slot3reword == "Pointsx3"){
         P2Points = P2Points + 3;
         }
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }
      }
      }
}
if (DidIt == true){
UpdateP1(FPP1, P1);
UpdateP2(FPP2, P2);
fireDragon(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
}
}

   private void fireDragon(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12){
   Stage = "gather4";
   String dragon1 = "null";
   String dragon2 = "null";
   String dragon3 = "null";
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(false);
   if (player == 1)
   {
   if (player1location.shop.Dragon1 != null)
   {
   dragon1 = player1location.shop.Dragon1.DragonsName;
   Buttons[0].setDisable(false);
   }
   if (player1location.shop.Dragon2 != null)
   {
   dragon2 = player1location.shop.Dragon2.DragonsName;
   Buttons[1].setDisable(false);
   }
   if (player1location.shop.Dragon3 != null)
   {
   dragon3 = player1location.shop.Dragon3.DragonsName;
   Buttons[2].setDisable(false);
   }
   taInfo.setText("pick a dragon to fire \r\n1)"+ dragon1  + "\r\n2)"+ dragon2 +"\r\n3):"+ dragon3 + "\r\n12)Skip fireing a dragon");
   }
   if (player == 2)
   {
   if (player2location.shop.Dragon1 != null)
   {
   dragon1 = player2location.shop.Dragon1.DragonsName;
   Buttons[0].setDisable(false);
   }
   if (player2location.shop.Dragon2 != null)
   {
   dragon2 = player2location.shop.Dragon2.DragonsName;
   Buttons[1].setDisable(false);
   }
   if (player2location.shop.Dragon3 != null)
   {
   dragon3 = player2location.shop.Dragon3.DragonsName;
   Buttons[2].setDisable(false);
   }
   taInfo.setText("pick a dragon to fire \r\n1)"+ dragon1 + "\r\n2)"+ dragon2 +"\r\n3)"+ dragon3 + "\r\n12)Skip fireing a dragon");
   }
   
   }
   private void FireStart(TextArea taInfo, Button[] Buttons,Hand Player1hand,Hand Player2hand,Park DragonPark,Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12){
   String hold="";
   if (player == 1){
      if (DragonFire == 1){
         hold = player1location.shop.Dragon1.DragonsType;
      }
      if (DragonFire == 2){
         hold = player1location.shop.Dragon2.DragonsType;
      }
      if (DragonFire == 3){
         hold = player1location.shop.Dragon3.DragonsType;
      }
      }
   if (player == 2){
      if (DragonFire == 1){
         hold = player2location.shop.Dragon1.DragonsType;
      }
      if (DragonFire == 2){
         hold = player2location.shop.Dragon2.DragonsType;
      }
      if (DragonFire == 3){
         hold = player2location.shop.Dragon3.DragonsType;
      }
   }
   if (hold == "Breed"){
   BreedDragon(taInfo,Buttons,Player1hand,Player2hand,DragonPark);
   }
   if (hold == "Plant"){
   PlantDragon(taInfo,Buttons);
   }
   if (hold == "Meat"){
   MeatDragon(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
   }
   if (hold == "Iron"){
   IronDragon(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
   }
   if (hold == "Gem"){
   GemDragon(taInfo,Buttons);
   }
   if (hold == "Potion"){
   if (player == 1){
      if (DragonFire == 1){
         PotionDragonHold1 = player1location.shop.Dragon1;
      }
      if (DragonFire == 2){
         PotionDragonHold1 = player1location.shop.Dragon2;
      }
      if (DragonFire == 3){
         PotionDragonHold1 = player1location.shop.Dragon3;
      }
      }
   if (player == 2){
      if (DragonFire == 1){
         PotionDragonHold1 = player2location.shop.Dragon1;
      }
      if (DragonFire == 2){
         PotionDragonHold1 = player2location.shop.Dragon2;
      }
      if (DragonFire == 3){
         PotionDragonHold1 = player2location.shop.Dragon3;
      }
      }
   PotionDragon(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
   }
   }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
   private void BreedDragon(TextArea taInfo, Button[] Buttons,Hand Player1hand,Hand Player2hand,Park DragonPark){
   Stage = "Breed1";
   taInfo.setText("Draw from deck or park\r\n1)Deck\r\n2)Park");
      Buttons[0].setDisable(false);
      Buttons[1].setDisable(false);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
   }
   
   private void BreedDragonHand(TextArea taInfo, Button[] Buttons,Hand Player1hand,Hand Player2hand,Park DragonPark,FlowPane FP, FlowPane FPD,dragon[] DragonArray,FlowPane Shop1,FlowPane Shop1D,FlowPane Shop2, FlowPane Shop2D,FlowPane Shop3, FlowPane Shop3D,FlowPane Shop4, FlowPane Shop4D,FlowPane Shop5, FlowPane Shop5D,FlowPane Shop6, FlowPane Shop6D,FlowPane Shop7, FlowPane Shop7D,FlowPane Shop8, FlowPane Shop8D,FlowPane Shop9, FlowPane Shop9D,FlowPane Shop10, FlowPane Shop10D,FlowPane Shop11, FlowPane Shop11D,FlowPane Shop12, FlowPane Shop12D,Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12,FlowPane FPP1, GridPane P1,FlowPane FPP2, GridPane P2, ArrayList<Shop> ShopArray,FlowPane ParkL, FlowPane ParkD){
   if (player == 1){
   Player1hand.HandDraw(DragonArray);
   Player1hand.HandUpdate(FP,FPD);
   }
   if (player == 2){
   Player2hand.HandDraw(DragonArray);
   Player2hand.HandUpdate(FP,FPD);
   }
   UseShop(taInfo, Buttons);
   }
   private void BreedDragonPark(TextArea taInfo, Button[] Buttons, Park DragonPark){
    Stage = "Breed2";
   String dragon1 = "null";
   String dragon2 = "null";
   String dragon3 = "null";
   String dragon4 = "null";
   String dragon5 = "null";
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
   if (DragonPark.Dragon1 != null)
   {
   dragon1 = DragonPark.Dragon1.DragonsName;
   Buttons[0].setDisable(false);
   }
   if (DragonPark.Dragon2 != null)
   {
   dragon2 = DragonPark.Dragon2.DragonsName;
   Buttons[1].setDisable(false);
   }
   if (DragonPark.Dragon3 != null)
   {
   dragon3 = DragonPark.Dragon3.DragonsName;
   Buttons[2].setDisable(false);
   }
   if (DragonPark.Dragon4 != null)
   {
   dragon4 = DragonPark.Dragon4.DragonsName;
   Buttons[3].setDisable(false);
   }
   if (DragonPark.Dragon5 != null)
   {
   dragon5 = DragonPark.Dragon5.DragonsName;
   Buttons[4].setDisable(false);
   }
   taInfo.setText("pick a dragon from the park \r\n1)"+ dragon1 + "\r\n2)"+ dragon2 +"\r\n3)"+ dragon3 + "\r\n4)"+ dragon4 + "\r\n5)"+ dragon5 + "\r\n12)Draw a random dragon instead");   
   }
   
   private void BreedDrawPark(TextArea taInfo, Button[] Buttons,Hand Player1hand,Hand Player2hand,Park DragonPark,FlowPane FPh, FlowPane FPDh,FlowPane FP, FlowPane FPD,dragon[] DragonArray,FlowPane FPP1, GridPane P1,FlowPane FPP2, GridPane P2,Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12,ArrayList<Shop> ShopArray,FlowPane ParkL, FlowPane ParkD){
   if (player == 1){
   if (DragonHold == 1){
   Player1hand.DragonHand.add(DragonPark.Dragon1);
   DragonPark.Dragon1 = null;
   Player1hand.HandUpdate(FPh,FPDh);
   }
   if (DragonHold == 2){
   Player1hand.DragonHand.add(DragonPark.Dragon2);
   Player1hand.HandUpdate(FPh,FPDh);
   DragonPark.Dragon2 = null;
   }
   if (DragonHold == 3){
   Player1hand.DragonHand.add(DragonPark.Dragon3);
   Player1hand.HandUpdate(FPh,FPDh);
   DragonPark.Dragon3 = null;
   }
   if (DragonHold == 4){
   Player1hand.DragonHand.add(DragonPark.Dragon4);
   Player1hand.HandUpdate(FPh,FPDh);
   DragonPark.Dragon4 = null;
   }
   if (DragonHold == 5){
   Player1hand.DragonHand.add(DragonPark.Dragon5);
   Player1hand.HandUpdate(FPh,FPDh);
   DragonPark.Dragon5 = null;
   }
   }
   if (player == 2){
   if (DragonHold == 1){
   Player2hand.DragonHand.add(DragonPark.Dragon1);
   Player2hand.HandUpdate(FPh,FPDh);
   DragonPark.Dragon1 = null;
   }
   if (DragonHold == 2){
   Player2hand.DragonHand.add(DragonPark.Dragon2);
   Player2hand.HandUpdate(FPh,FPDh);
   DragonPark.Dragon2 = null;
   }
   if (DragonHold == 3){
   Player2hand.DragonHand.add(DragonPark.Dragon3);
   Player2hand.HandUpdate(FPh,FPDh);
   DragonPark.Dragon3 = null;
   }
   if (DragonHold == 4){
   Player2hand.DragonHand.add(DragonPark.Dragon4);
   Player2hand.HandUpdate(FPh,FPDh);
   DragonPark.Dragon4 = null;
   }
   if (DragonHold == 5){
   Player2hand.DragonHand.add(DragonPark.Dragon5);
   Player2hand.HandUpdate(FPh,FPDh);
   DragonPark.Dragon5 = null;
   }
   }
   DragonPark.ParkUpdate(ParkL,ParkD,DragonArray);
   UseShop(taInfo, Buttons);
   }
   
   private void PlantDragon(TextArea taInfo, Button[] Buttons){
   taInfo.setText("Pick What good to gift\r\n1)Breed\r\n2)Meat\r\n3)Potion\r\n4)Iron\r\n5)Gem\r\n6)Plants");
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
      if (player == 1){
         if (P1Breed != 0){
         Buttons[0].setDisable(false);
         }
         if (P1Meat != 0){
         Buttons[1].setDisable(false);
         }
         if (P1Potion != 0){
         Buttons[2].setDisable(false);
         }
         if (P1Iron != 0){
         Buttons[3].setDisable(false);
         }
         if (P1Gems != 0){
         Buttons[4].setDisable(false);
         }
         if (P1Plants != 0){
         Buttons[5].setDisable(false);
         }
      }
      if (player == 2){
         if (P2Breed != 0){
         Buttons[0].setDisable(false);
         }
         if (P2Meat != 0){
         Buttons[1].setDisable(false);
         }
         if (P2Potion != 0){
         Buttons[2].setDisable(false);
         }
         if (P2Iron != 0){
         Buttons[3].setDisable(false);
         }
         if (P2Gems != 0){
         Buttons[4].setDisable(false);
         }
         if (P2Plants != 0){
         Buttons[5].setDisable(false);
         }
      }
      
      Stage = "Plant";
   }
   
   private void PlantDragon(FlowPane FPP1, GridPane P1, FlowPane FPP2, GridPane P2,TextArea taInfo,Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12,ArrayList<Shop> ShopArray,FlowPane ParkL, FlowPane ParkD, dragon[] DragonArray, Park DragonPark, Button[] Buttons){
   if (player == 1){
   if (DragonHold == 1){
      P1Breed = P1Breed - 1;
      P2Breed = P2Breed + 1;
      P1Points = P1Points +2;
   }
   if (DragonHold == 2){
      P1Meat = P1Meat - 1;
      P2Meat = P2Meat + 1;
      P1Points = P1Points +2;
   }
   if (DragonHold == 3){
      P1Potion = P1Potion - 1;
      P2Potion = P2Potion + 1;
      P1Points = P1Points +2;
   }
   if (DragonHold == 4){
      P1Iron = P1Iron - 1;
      P2Iron = P2Iron + 1;
      P1Points = P1Points + 2;
   }
   if (DragonHold == 5){
      P1Gems = P1Gems - 1;
      P2Gems = P2Gems + 1;
      P1Points = P1Points + 2;
   }
   if (DragonHold == 6){
      P1Plants = P1Plants - 1;
      P2Plants = P2Plants + 1;
      P1Points = P1Points + 2;
   }
   }
   if (player == 2){
   if (DragonHold == 1){
      P1Breed = P1Breed + 1;
      P2Breed = P2Breed - 1;
      P2Points = P2Points +2;
   }
   if (DragonHold == 2){
      P1Meat = P1Meat + 1;
      P2Meat = P2Meat - 1;
      P2Points = P2Points +2;
   }
   if (DragonHold == 3){
      P1Potion = P1Potion + 1;
      P2Potion = P2Potion - 1;
      P2Points = P2Points +2;
   }
   if (DragonHold == 4){
      P1Iron = P1Iron + 1;
      P2Iron = P2Iron - 1;
      P2Points = P2Points + 2;
   }
   if (DragonHold == 5){
      P1Gems = P1Gems + 1;
      P2Gems = P2Gems - 1;
      P2Points = P2Points + 2;
   }
   if (DragonHold == 6){
      P1Plants = P1Plants + 1;
      P2Plants = P2Plants - 1;
      P2Points = P2Points + 2;
   }
   }
   UpdateP1(FPP1,P1);
   UpdateP2(FPP2,P2);
   UseShop(taInfo, Buttons);
   }
   
   private void MeatDragon(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12){
   Stage = "Meat";
   taInfo.setText("Pick any shop \r\n1)" + location1.shop.ShopName + 
      "\r\n2)" + location2.shop.ShopName + 
      "\r\n3)" + location3.shop.ShopName + 
      "\r\n4)" + location4.shop.ShopName + 
      "\r\n5)" + location5.shop.ShopName + 
      "\r\n6)" + location6.shop.ShopName + 
      "\r\n7)" + location7.shop.ShopName +
      "\r\n8)" + location8.shop.ShopName + 
      "\r\n9)" + location9.shop.ShopName + 
      "\r\n10)" + location10.shop.ShopName + 
      "\r\n11)" + location11.shop.ShopName +
      "\r\n12)" + location12.shop.ShopName);
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
      if (location1.shop.ShopName != "Notthing here")
      {
      Buttons[0].setDisable(false);
      }
      if (location2.shop.ShopName != "Notthing here")
      {
      Buttons[1].setDisable(false);
      }
      if (location3.shop.ShopName != "Notthing here")
      {
      Buttons[2].setDisable(false);
      }
      if (location4.shop.ShopName != "Notthing here")
      {
      Buttons[3].setDisable(false);
      }
      if (location5.shop.ShopName != "Notthing here")
      {
      Buttons[4].setDisable(false);
      }
      if (location6.shop.ShopName != "Notthing here")
      {
      Buttons[5].setDisable(false);
      }
      if (location7.shop.ShopName != "Notthing here")
      {
      Buttons[6].setDisable(false);
      }
      if (location8.shop.ShopName != "Notthing here")
      {
      Buttons[7].setDisable(false);
      }
      if (location9.shop.ShopName != "Notthing here")
      {
      Buttons[8].setDisable(false);
      }
      if (location10.shop.ShopName != "Notthing here")
      {
      Buttons[9].setDisable(false);
      }
      if (location11.shop.ShopName != "Notthing here")
      {
      Buttons[10].setDisable(false);
      }
      if (location12.shop.ShopName != "Notthing here")
      {
      Buttons[11].setDisable(false);
      }
      }
      
      private void MeatDragonPlace(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12){
      Stage = "Meat1";
      taInfo.setText("place a dragon \r\n1) Slot 1:"+ MeatDragonHold.shop.slot1Type1 + "/" + MeatDragonHold.shop.slot1Type2 + "\r\n2) Slot 2:"+ MeatDragonHold.shop.slot2Type1 + "/" + MeatDragonHold.shop.slot2Type2 +"\r\n3) Slot 3:"+ MeatDragonHold.shop.slot3Type1 + "/" + MeatDragonHold.shop.slot3Type2 + "\r\n12)Skip placeing dragon");
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(false);
      if(MeatDragonHold.shop.Dragon1 == null)
      {
      Buttons[0].setDisable(false);
      }
      if(MeatDragonHold.shop.Dragon2 == null)
      {
      Buttons[1].setDisable(false);
      }
      if(MeatDragonHold.shop.Dragon3 == null)
      {
      Buttons[2].setDisable(false);
      }
      }
      
      private void MeatPlaceDragon(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, Hand Player1hand,Hand Player2hand){
      Stage = "Meat2";
      String hold = "Pick a dragon to place";
      int test = 0;
      if(player == 1){
      for (dragon d : Player1hand.DragonHand) {
      hold +="\r\n" + test +")" + d.DragonsName;
      test= test+1;
      }
      hold = hold + "\r\n12)Skip placeing dragon";
      hold = hold.replace("\r\n0)hold","");
      taInfo.setText(hold);
      for(int I=0; I<Buttons.length; ++I)
      {
      Buttons[I].setDisable(true);
      }
      for(int I = 1; I < test; ++I)
      {
      Buttons[I-1].setDisable(false);
      }
      Buttons[11].setDisable(false);
      }
      if(player == 2){
      for (dragon d : Player2hand.DragonHand) {
      hold +="\r\n" + test +")" + d.DragonsName;
      test= test+1;
      }
      hold = hold + "\r\n12)Skip placeing dragon";
      hold = hold.replace("\r\n0)hold","");
      taInfo.setText(hold);
      for(int I=0; I<Buttons.length; ++I)
      {
      Buttons[I].setDisable(true);
      }
      for(int I = 1; I < test; ++I)
      {
      Buttons[I-1].setDisable(false);
      }
      Buttons[11].setDisable(false);
      }
      }
      private void MeatPlaceDragonError(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, Hand Player1hand,Hand Player2hand){
      Stage = "Meat2";
      String hold = "That dragon can not be placed there\r\nPick a dragon to place";
      int test = 0;
      if(player == 1){
      for (dragon d : Player1hand.DragonHand) {
      hold +="\r\n" + test +")" + d.DragonsName;
      test= test+1;
      }
      hold = hold + "\r\n12)Skip placeing dragon";
      hold = hold.replace("\r\n0)hold","");
      taInfo.setText(hold);
      for(int I=0; I<Buttons.length; ++I)
      {
      Buttons[I].setDisable(true);
      }
      for(int I = 1; I < test; ++I)
      {
      Buttons[I-1].setDisable(false);
      }
      Buttons[11].setDisable(false);
      }
      if(player == 2){
      for (dragon d : Player2hand.DragonHand) {
      hold +="\r\n" + test +")" + d.DragonsName;
      test= test+1;
      }
      hold = hold + "\r\n12)Skip placeing dragon";
      hold = hold.replace("\r\n0)hold","");
      taInfo.setText(hold);
      for(int I=0; I<Buttons.length; ++I)
      {
      Buttons[I].setDisable(true);
      }
      for(int I = 1; I < test; ++I)
      {
      Buttons[I-1].setDisable(false);
      }
      Buttons[11].setDisable(false);
      }      }

      private void MeatsetDragon(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, Hand Player1hand,Hand Player2hand,
      FlowPane HandL ,FlowPane HandD, FlowPane Shop1,FlowPane Shop1D,FlowPane Shop2, FlowPane Shop2D,FlowPane Shop3, FlowPane Shop3D,FlowPane Shop4, FlowPane Shop4D,FlowPane Shop5, FlowPane Shop5D,FlowPane Shop6, FlowPane Shop6D,FlowPane Shop7, FlowPane Shop7D,FlowPane Shop8, FlowPane Shop8D,FlowPane Shop9, FlowPane Shop9D,FlowPane Shop10, FlowPane Shop10D,FlowPane Shop11, FlowPane Shop11D,FlowPane Shop12, FlowPane Shop12D,FlowPane FPP1, GridPane P1,FlowPane FPP2, GridPane P2,ArrayList<Shop> ShopArray,FlowPane ParkL, FlowPane ParkD){
      {
      DidIt = false;
      if (player == 1)
      {
      dragon Hold = Player1hand.DragonHand.get(DragonHold);
      
      if (SlotHold == 1){
         if (MeatDragonHold.shop.slot1Type1 == Hold.DragonsType || MeatDragonHold.shop.slot1Type2 == Hold.DragonsType || MeatDragonHold.shop.slot1Type2 == "Wild" || MeatDragonHold.shop.slot1Type2 == "Wild")
         {
         Player1hand.DragonHand.remove(DragonHold);
         MeatDragonHold.shop.Dragon1 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player1hand.HandUpdate(HandL, HandD);
          if (MeatDragonHold.shop.slot1reword == "Coin"){
         P1Coins = P1Coins + 1;
         }
         if (MeatDragonHold.shop.slot1reword == "Coinx2"){
         P1Coins = P1Coins + 2;
         }
         if (MeatDragonHold.shop.slot1reword == "SD"){
         //Draw Special  dragon
         }
         if (MeatDragonHold.shop.slot1reword == "Pointsx2"){
         P1Points = P1Points + 2;
         }
         if (MeatDragonHold.shop.slot1reword == "Pointsx3"){
         P1Points = P1Points + 3;
         }
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }

      }
            if (SlotHold == 2){
         if (MeatDragonHold.shop.slot2Type1 == Hold.DragonsType || MeatDragonHold.shop.slot2Type2 == Hold.DragonsType || MeatDragonHold.shop.slot2Type2 == "Wild" || MeatDragonHold.shop.slot2Type2 == "Wild")
         {
         Player1hand.DragonHand.remove(DragonHold);
         MeatDragonHold.shop.Dragon2 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player1hand.HandUpdate(HandL, HandD);
         if (MeatDragonHold.shop.slot2reword == "Coin"){
         P1Coins = P1Coins + 1;
         }
         if (MeatDragonHold.shop.slot2reword == "Coinx2"){
         P1Coins = P1Coins + 2;
         }
         if (MeatDragonHold.shop.slot2reword == "SD"){
         //Draw Special  dragon
         }
         if (MeatDragonHold.shop.slot2reword == "Pointsx2"){
         P1Points = P1Points + 2;
         }
         if (MeatDragonHold.shop.slot2reword == "Pointsx3"){
         P1Points = P1Points + 3;
         }
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }

      }
      
      if (SlotHold == 3){
         if (MeatDragonHold.shop.slot3Type1 == Hold.DragonsType || MeatDragonHold.shop.slot3Type2 == Hold.DragonsType || MeatDragonHold.shop.slot3Type2 == "Wild" || MeatDragonHold.shop.slot3Type2 == "Wild"){
         Player1hand.DragonHand.remove(DragonHold);
         MeatDragonHold.shop.Dragon3 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player1hand.HandUpdate(HandL, HandD);
         if (MeatDragonHold.shop.slot3reword == "Coin"){
         P1Coins = P1Coins + 1;
         }
         if (MeatDragonHold.shop.slot3reword == "Coinx2"){
         P1Coins = P1Coins + 2;
         }
         if (MeatDragonHold.shop.slot3reword == "SD"){
         //Draw Special  dragon
         }
         if (MeatDragonHold.shop.slot3reword == "Pointsx2"){
         P1Points = P1Points + 2;
         }
         if (MeatDragonHold.shop.slot3reword == "Pointsx3"){
         P1Points = P1Points + 3;
         }
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }

      }
      
      }
      if (player == 2){
      dragon Hold = Player2hand.DragonHand.get(DragonHold);
      
      if (SlotHold == 1){
         if (player2location.shop.slot1Type1 == Hold.DragonsType || player2location.shop.slot1Type2 == Hold.DragonsType || player2location.shop.slot1Type2 == "Wild" || player2location.shop.slot1Type2 == "Wild")
         {
         Player2hand.DragonHand.remove(DragonHold);
         MeatDragonHold.shop.Dragon1 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player2hand.HandUpdate(HandL, HandD);
         if (MeatDragonHold.shop.slot1reword == "Coin"){
         P2Coins = P2Coins + 1;
         }
         if (MeatDragonHold.shop.slot1reword == "Coinx2"){
         P2Coins = P2Coins + 2;
         }
         if (MeatDragonHold.shop.slot1reword == "SD"){
         //Draw Special  dragon
         }
         if (MeatDragonHold.shop.slot1reword == "Pointsx2"){
         P2Points = P2Points + 2;
         }
         if (MeatDragonHold.shop.slot1reword == "Pointsx3"){
         P2Points = P2Points + 3;
         }
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }

      }
      
      if (SlotHold == 2){
         if (MeatDragonHold.shop.slot2Type1 == Hold.DragonsType || MeatDragonHold.shop.slot2Type2 == Hold.DragonsType || MeatDragonHold.shop.slot2Type2 == "Wild" || MeatDragonHold.shop.slot2Type2 == "Wild")
         {
         Player2hand.DragonHand.remove(DragonHold);
         MeatDragonHold.shop.Dragon2 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player2hand.HandUpdate(HandL, HandD);
         if (MeatDragonHold.shop.slot2reword == "Coin"){
         P2Coins = P2Coins + 1;
         }
         if (MeatDragonHold.shop.slot2reword == "Coinx2"){
         P2Coins = P2Coins + 2;
         }
         if (MeatDragonHold.shop.slot2reword == "SD"){
         //Draw Special  dragon
         }
         if (MeatDragonHold.shop.slot2reword == "Pointsx2"){
         P2Points = P2Points + 2;
         }
         if (MeatDragonHold.shop.slot2reword == "Pointsx3"){
         P2Points = P2Points + 3;
         }
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }
      }
      
      if (SlotHold == 3){
         if (MeatDragonHold.shop.slot3Type1 == Hold.DragonsType || MeatDragonHold.shop.slot3Type2 == Hold.DragonsType || MeatDragonHold.shop.slot3Type2 == "Wild" || MeatDragonHold.shop.slot3Type2 == "Wild")
         {
         Player2hand.DragonHand.remove(DragonHold);
         MeatDragonHold.shop.Dragon3 = Hold;
         updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
         Player2hand.HandUpdate(HandL, HandD);
         DidIt = true;
         }
         else{
      PlaceDragonError(taInfo, Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Player1hand,Player2hand);
      }
      }
      }
}
if (DidIt == true){
UpdateP1(FPP1, P1);
UpdateP2(FPP2, P2);
UseShop(taInfo, Buttons);
}
}
   
   private void IronDragon(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12){
   Stage = "Iron";
   String hold = "";
      Buttons[0].setDisable(false);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(false);
   if (player == 1){
   hold = "Pick a resource to get 2 of\r\n1)";
   hold = hold + player1location.shop.ShopType;
   if (player1location.shop.Dragon1 != null){
    hold = hold + "\r\n2)" + player1location.shop.Dragon1.DragonsType;
    Buttons[1].setDisable(false);
   }
   if (player1location.shop.Dragon2 != null){
    hold = hold + "\r\n3)" + player1location.shop.Dragon2.DragonsType;
    Buttons[2].setDisable(false);
   }
   if (player1location.shop.Dragon3 != null){
    hold = hold + "\r\n2)" + player1location.shop.Dragon3.DragonsType;
    Buttons[3].setDisable(false);
   }
   }
   if (player == 2){
   hold = "Pick a resource to get 2 of\r\n1)";
   hold = hold + player2location.shop.ShopType;
   if (player2location.shop.Dragon1 != null){
    hold = hold + "\r\n2)" + player2location.shop.Dragon1.DragonsType;
    Buttons[1].setDisable(false);
   }
   if (player2location.shop.Dragon2 != null){
    hold = hold + "\r\n3)" + player2location.shop.Dragon2.DragonsType;
    Buttons[2].setDisable(false);
   }
   if (player2location.shop.Dragon3 != null){
    hold = hold + "\r\n2)" + player2location.shop.Dragon3.DragonsType;
    Buttons[3].setDisable(false);
   }
   }
   taInfo.setText(hold);
   }
   
   private void IronDragon2(Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12,FlowPane FPP1, GridPane P1, FlowPane FPP2, GridPane P2,TextArea taInfo, Button[] Buttons){
   String DragonsType1 = "";
   if (player == 1){
    if (DragonIron == 1){
    String ShopType = player1location.shop.ShopType;
    if (ShopType == "Breed"){
      P1Breed =  P1Breed + 2;
      }
      if (ShopType == "Meat"){
      P1Meat = P1Meat + 2;
      }
      if (ShopType == "Potion"){
      P1Potion = P1Potion + 2;
      }
      if (ShopType == "Iron")
      P1Iron = P1Iron + 2;
      
      if (ShopType == "Gem"){
      P1Gems = P1Gems + 2;
      }
      if (ShopType == "Plant"){
      P1Plants = P1Plants + 2 ;
      }
      }
      
      if(DragonIron == 2){
      DragonsType1 = player1location.shop.Dragon1.DragonsType;
      }
      if(DragonIron == 3){
      DragonsType1 = player1location.shop.Dragon2.DragonsType;
      }
      if(DragonIron == 4){
      DragonsType1 = player1location.shop.Dragon3.DragonsType;
      }
       if (DragonsType1 == "Breed"){
      P1Breed =  P1Breed + 2;
      }
      if (DragonsType1 == "Meat"){
      P1Meat = P1Meat + 2;
      }
      if (DragonsType1 == "Potion"){
      P1Potion = P1Potion + 2;
      }
      if (DragonsType1 == "Iron")
      P1Iron = P1Iron + 2;
      
      if (DragonsType1 == "Gem"){
      P1Gems = P1Gems + 2;
      }
      if (DragonsType1 == "Plant"){
      P1Plants = P1Plants + 2 ;
      }
      
    }
    
     if (player == 2){
    if (DragonIron == 1){
    String ShopType = player2location.shop.ShopType;
    if (ShopType == "Breed"){
      P2Breed =  P2Breed + 2;
      }
      if (ShopType == "Meat"){
      P2Meat = P2Meat + 2;
      }
      if (ShopType == "Potion"){
      P2Potion = P2Potion + 2;
      }
      if (ShopType == "Iron")
      P2Iron = P2Iron + 2;
      
      if (ShopType == "Gem"){
      P2Gems = P2Gems + 2;
      }
      if (ShopType == "Plant"){
      P2Plants = P2Plants + 2 ;
      }
      }
      if(DragonIron == 2){
      DragonsType1 = player2location.shop.Dragon1.DragonsType;
      }
      if(DragonIron == 3){
      DragonsType1 = player2location.shop.Dragon2.DragonsType;
      }
      if(DragonIron == 4){
      DragonsType1 = player2location.shop.Dragon3.DragonsType;
      }
       if (DragonsType1 == "Breed"){
      P2Breed =  P2Breed + 2;
      }
      if (DragonsType1 == "Meat"){
      P2Meat = P2Meat + 2;
      }
      if (DragonsType1 == "Potion"){
      P2Potion = P2Potion + 2;
      }
      if (DragonsType1 == "Iron")
      P2Iron = P2Iron + 2;
      
      if (DragonsType1 == "Gem"){
      P2Gems = P2Gems + 2;
      }
      if (DragonsType1 == "Plant"){
      P2Plants = P1Plants + 2 ;
      }
      }
      UpdateP1(FPP1,P1);
      UpdateP2(FPP2,P2);
      UseShop(taInfo,Buttons);
   }
   
   private void GemDragon(TextArea taInfo, Button[] Buttons){
   taInfo.setText("pick the first resource\r\n1)Breed\r\nMeat\r\n3)Potion\r\n4)Iron\r\n5)Gems\r\n6)Plants");
   Stage = "Gem";
   Buttons[0].setDisable(false);
      Buttons[1].setDisable(false);
      Buttons[2].setDisable(false);
      Buttons[3].setDisable(false);
      Buttons[4].setDisable(false);
      Buttons[5].setDisable(false);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
   }
   private void GemDragon2(TextArea taInfo, Button[] Buttons){
   taInfo.setText("pick the second resource\r\n1)Breed\r\nMeat\r\n3)Potion\r\n4)Iron\r\n5)Gems\r\n6)Plants");
   Stage = "Gem1";
   }
   private void GemDragon3(TextArea taInfo, Button[] Buttons){
   taInfo.setText("pick the third resource\r\n1)Breed\r\nMeat\r\n3)Potion\r\n4)Iron\r\n5)Gems\r\n6)Plants");
   Stage = "Gem2";
   }
   
   private void PotionDragon(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12){
      Stage = "Potion";
   taInfo.setText("Pick any shop \r\n1)" + location1.shop.ShopName + 
      "\r\n2)" + location2.shop.ShopName + 
      "\r\n3)" + location3.shop.ShopName + 
      "\r\n4)" + location4.shop.ShopName + 
      "\r\n5)" + location5.shop.ShopName + 
      "\r\n6)" + location6.shop.ShopName + 
      "\r\n7)" + location7.shop.ShopName +
      "\r\n8)" + location8.shop.ShopName + 
      "\r\n9)" + location9.shop.ShopName + 
      "\r\n10)" + location10.shop.ShopName + 
      "\r\n11)" + location11.shop.ShopName +
      "\r\n12)" + location12.shop.ShopName);
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
      if (location1.shop.ShopName != "Notthing here")
      {
      Buttons[0].setDisable(false);
      }
      if (location2.shop.ShopName != "Notthing here")
      {
      Buttons[1].setDisable(false);
      }
      if (location3.shop.ShopName != "Notthing here")
      {
      Buttons[2].setDisable(false);
      }
      if (location4.shop.ShopName != "Notthing here")
      {
      Buttons[3].setDisable(false);
      }
      if (location5.shop.ShopName != "Notthing here")
      {
      Buttons[4].setDisable(false);
      }
      if (location6.shop.ShopName != "Notthing here")
      {
      Buttons[5].setDisable(false);
      }
      if (location7.shop.ShopName != "Notthing here")
      {
      Buttons[6].setDisable(false);
      }
      if (location8.shop.ShopName != "Notthing here")
      {
      Buttons[7].setDisable(false);
      }
      if (location9.shop.ShopName != "Notthing here")
      {
      Buttons[8].setDisable(false);
      }
      if (location10.shop.ShopName != "Notthing here")
      {
      Buttons[9].setDisable(false);
      }
      if (location11.shop.ShopName != "Notthing here")
      {
      Buttons[10].setDisable(false);
      }
      if (location12.shop.ShopName != "Notthing here")
      {
      Buttons[11].setDisable(false);
      }
   }
   private void PotionDragon2(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12){
      Stage = "Potion1";
      String Dragon1 = "Null";
      String Dragon2 = "Null";
      String Dragon3 = "Null";
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(false);
      if(PotionDragonLocationHold.shop.Dragon1 != null)
      {
      Dragon1 = PotionDragonLocationHold.shop.Dragon1.DragonsName;
      Buttons[0].setDisable(false);
      }
      if(PotionDragonLocationHold.shop.Dragon2 != null)
      {
      Dragon2 = PotionDragonLocationHold.shop.Dragon2.DragonsName;
      Buttons[1].setDisable(false);
      }
      if(PotionDragonLocationHold.shop.Dragon3 != null)
      {
      Dragon3 = PotionDragonLocationHold.shop.Dragon3.DragonsName;
      Buttons[2].setDisable(false);
      }
      taInfo.setText("pick a Dragon to swap with " + PotionDragonHold1.DragonsName + "\r\n1) "+ Dragon1 +"\r\n2) "+ Dragon2 + "\r\n3) "+ Dragon3);
      }
      
      private void PotionDragon3(TextArea taInfo, Button[] Buttons,FlowPane Shop1,FlowPane Shop1D,FlowPane Shop2, FlowPane Shop2D,FlowPane Shop3, FlowPane Shop3D,FlowPane Shop4, FlowPane Shop4D,FlowPane Shop5, FlowPane Shop5D,FlowPane Shop6, FlowPane Shop6D,FlowPane Shop7, FlowPane Shop7D,FlowPane Shop8, FlowPane Shop8D,FlowPane Shop9, FlowPane Shop9D,FlowPane Shop10, FlowPane Shop10D,FlowPane Shop11, FlowPane Shop11D,FlowPane Shop12, FlowPane Shop12D,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12,Hand Player1hand,Hand Player2hand,Park DragonPark){
      if (player == 1){
      if (DragonFire == 1){
         player1location.shop.Dragon1 = PotionDragonHold2;
      }
      if (DragonFire == 2){
         player1location.shop.Dragon2 = PotionDragonHold2;
      }
      if (DragonFire == 3){
         player1location.shop.Dragon3 = PotionDragonHold2;
      }
      }
   if (player == 2){
      if (DragonFire == 1){
         player2location.shop.Dragon1 = PotionDragonHold2;
      }
      if (DragonFire == 2){
         player2location.shop.Dragon2 = PotionDragonHold2;
      }
      if (DragonFire == 3){
         player2location.shop.Dragon3 = PotionDragonHold2;
      }
      }
      if (DragonPotion == 1){
         PotionDragonLocationHold.shop.Dragon1 = PotionDragonHold1;
      }
      if (DragonPotion == 2){
         PotionDragonLocationHold.shop.Dragon2 = PotionDragonHold1;
      }
      if (DragonPotion == 3){
         PotionDragonLocationHold.shop.Dragon3 = PotionDragonHold1;
      }
      updateshops(Shop1,Shop1D,Shop2,Shop2D,Shop3,Shop3D,Shop4,Shop4D,Shop5,Shop5D,Shop6, Shop6D,Shop7,Shop7D,Shop8,Shop8D,Shop9,Shop9D,Shop10,Shop10D,Shop11,Shop11D,Shop12,Shop12D,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12);
      FireStart(taInfo,Buttons,Player1hand,Player2hand,DragonPark,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10, location11,location12);
      }
   
   private void updateshops(FlowPane Shop1,FlowPane Shop1D,FlowPane Shop2, FlowPane Shop2D,FlowPane Shop3, FlowPane Shop3D,FlowPane Shop4, FlowPane Shop4D,FlowPane Shop5, FlowPane Shop5D,FlowPane Shop6, FlowPane Shop6D,FlowPane Shop7, FlowPane Shop7D,FlowPane Shop8, FlowPane Shop8D,FlowPane Shop9, FlowPane Shop9D,FlowPane Shop10, FlowPane Shop10D,FlowPane Shop11, FlowPane Shop11D,FlowPane Shop12, FlowPane Shop12D,
    Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12){
   location1.shop.UpdateDragons(Shop1, Shop1D);
   location2.shop.UpdateDragons(Shop2, Shop2D);
   location3.shop.UpdateDragons(Shop3, Shop3D);
   location4.shop.UpdateDragons(Shop4, Shop4D);
   location5.shop.UpdateDragons(Shop5, Shop5D);
   location6.shop.UpdateDragons(Shop6, Shop6D);
   location7.shop.UpdateDragons(Shop7, Shop7D);
   location8.shop.UpdateDragons(Shop8, Shop8D);
   location9.shop.UpdateDragons(Shop9, Shop9D);
   location10.shop.UpdateDragons(Shop10, Shop10D);
   location11.shop.UpdateDragons(Shop11, Shop11D);
   location12.shop.UpdateDragons(Shop12, Shop12D);
   }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//Shop abilaty
   private void UseShop(TextArea taInfo, Button[] Buttons)
   {
   Stage = "ShopA";
   taInfo.setText("Use Shop abilty \r\n1)Yes\r\n2)No");
   Buttons[0].setDisable(true);
      Buttons[1].setDisable(false);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
   }   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Enchatments
   private void Enchant1(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12){
      Stage = "Enchant1";
      taInfo.setText("Pick a shop \r\n1)" + location1.shop.ShopName + 
      "\r\n2)" + location2.shop.ShopName + 
      "\r\n3)" + location3.shop.ShopName + 
      "\r\n4)" + location4.shop.ShopName + 
      "\r\n5)" + location5.shop.ShopName + 
      "\r\n6)" + location6.shop.ShopName + 
      "\r\n7)" + location7.shop.ShopName +
      "\r\n8)" + location8.shop.ShopName + 
      "\r\n9)" + location9.shop.ShopName + 
      "\r\n10)" + location10.shop.ShopName + 
      "\r\n11)" + location11.shop.ShopName +
      "\r\n12)" + location12.shop.ShopName);
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
      if (location1.shop.ShopName != "Notthing here")
      {
      Buttons[0].setDisable(false);
      }
      if (location2.shop.ShopName != "Notthing here")
      {
      Buttons[1].setDisable(false);
      }
      if (location3.shop.ShopName != "Notthing here")
      {
      Buttons[2].setDisable(false);
      }
      if (location4.shop.ShopName != "Notthing here")
      {
      Buttons[3].setDisable(false);
      }
      if (location5.shop.ShopName != "Notthing here")
      {
      Buttons[4].setDisable(false);
      }
      if (location6.shop.ShopName != "Notthing here")
      {
      Buttons[5].setDisable(false);
      }
      if (location7.shop.ShopName != "Notthing here")
      {
      Buttons[6].setDisable(false);
      }
      if (location8.shop.ShopName != "Notthing here")
      {
      Buttons[7].setDisable(false);
      }
      if (location9.shop.ShopName != "Notthing here")
      {
      Buttons[8].setDisable(false);
      }
      if (location10.shop.ShopName != "Notthing here")
      {
      Buttons[9].setDisable(false);
      }
      if (location11.shop.ShopName != "Notthing here")
      {
      Buttons[10].setDisable(false);
      }
      if (location12.shop.ShopName != "Notthing here")
      {
      Buttons[11].setDisable(false);
      }
      }
      private void Enchant2(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, EnchantPark Enchanments){
      Stage = "Enchant2";
      String Enchant1 = "Null";
      String Enchant2 = "Null";
      String Enchant3 = "Null";
      String Enchant4 = "Null";
      String Enchant5 = "Null";
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
      if (Enchanments.enchant1 != null){
      Enchant1 = Enchanments.enchant1.EnchantName;
      Buttons[0].setDisable(false);
      }
      if (Enchanments.enchant2 != null){
      Enchant2 = Enchanments.enchant2.EnchantName;
      Buttons[1].setDisable(false);
      }
      if (Enchanments.enchant3 != null){
      Enchant3 = Enchanments.enchant3.EnchantName;
      Buttons[2].setDisable(false);
      }
      if (Enchanments.enchant4 != null){
      Enchant4 = Enchanments.enchant4.EnchantName;
      Buttons[3].setDisable(false);
      }
      if (Enchanments.enchant5 != null){
      Enchant5 = Enchanments.enchant5.EnchantName;
      Buttons[4].setDisable(false);
      }
      taInfo.setText("Pick an Enchantment \r\n1) "+ Enchant1 +"\r\n2) "+ Enchant2 + "\r\n3) "+ Enchant3 + "\r\n4) "+ Enchant4 + "\r\n5) "+ Enchant5);
      }
      private void Enchant2Error(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, EnchantPark Enchanments){
      Stage = "Enchant2";
      String Enchant1 = "Null";
      String Enchant2 = "Null";
      String Enchant3 = "Null";
      String Enchant4 = "Null";
      String Enchant5 = "Null";
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(false);
      if (Enchanments.enchant1 != null){
      Enchant1 = Enchanments.enchant1.EnchantName;
      Buttons[0].setDisable(false);
      }
      if (Enchanments.enchant2 != null){
      Enchant2 = Enchanments.enchant2.EnchantName;
      Buttons[1].setDisable(false);
      }
      if (Enchanments.enchant3 != null){
      Enchant3 = Enchanments.enchant3.EnchantName;
      Buttons[2].setDisable(false);
      }
      if (Enchanments.enchant4 != null){
      Enchant4 = Enchanments.enchant4.EnchantName;
      Buttons[3].setDisable(false);
      }
      if (Enchanments.enchant5 != null){
      Enchant5 = Enchanments.enchant5.EnchantName;
      Buttons[4].setDisable(false);
      }
      taInfo.setText("That Enchantment can not be put ther Pick another Enchantment \r\n1) "+ Enchant1 +"\r\n2) "+ Enchant2 + "\r\n3) "+ Enchant3 + "\r\n4) "+ Enchant4 + "\r\n5) "+ Enchant5+ "\r\n12) Restart over");
      }
      private void Enchant2Error2(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, EnchantPark Enchanments){
      Stage = "Enchant2";
      String Enchant1 = "Null";
      String Enchant2 = "Null";
      String Enchant3 = "Null";
      String Enchant4 = "Null";
      String Enchant5 = "Null";
      Buttons[0].setDisable(true);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(false);
      if (Enchanments.enchant1 != null){
      Enchant1 = Enchanments.enchant1.EnchantName;
      Buttons[0].setDisable(false);
      }
      if (Enchanments.enchant2 != null){
      Enchant2 = Enchanments.enchant2.EnchantName;
      Buttons[1].setDisable(false);
      }
      if (Enchanments.enchant3 != null){
      Enchant3 = Enchanments.enchant3.EnchantName;
      Buttons[2].setDisable(false);
      }
      if (Enchanments.enchant4 != null){
      Enchant4 = Enchanments.enchant4.EnchantName;
      Buttons[3].setDisable(false);
      }
      if (Enchanments.enchant5 != null){
      Enchant5 = Enchanments.enchant5.EnchantName;
      Buttons[4].setDisable(false);
      }
      taInfo.setText("You do not have the Resources for that enchantment Pick another Enchantment \r\n1) "+ Enchant1 +"\r\n2) "+ Enchant2 + "\r\n3) "+ Enchant3 + "\r\n4) "+ Enchant4 + "\r\n5) "+ Enchant5 + "\r\n12) Restart over");
      }
      private void EnchantCheck1(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, EnchantPark Enchanments,Hand Player1hand,Hand Player2hand,FlowPane FP, FlowPane FPD,dragon[] DragonArray){
      if (player == 1){
         if (EnchantHold == 1){
          if (Enchanments.enchant1.Type == player1location.shop.ShopType){
          EnchantCheck2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else {
         Enchant2Error(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         } 
         }
         if (EnchantHold == 2){
          if (Enchanments.enchant2.Type == player1location.shop.ShopType){
          EnchantCheck2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else {
         Enchant2Error(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         }
         }
         if (EnchantHold == 3){
          if (Enchanments.enchant3.Type == player1location.shop.ShopType){
          EnchantCheck2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else {
         Enchant2Error(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         }
         }
         if (EnchantHold == 4){
          if (Enchanments.enchant4.Type == player1location.shop.ShopType){
          EnchantCheck2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else {
         Enchant2Error(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         }
         }
         if (EnchantHold == 5){
          if (Enchanments.enchant5.Type == player1location.shop.ShopType){
          EnchantCheck2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
          }
          else {
          Enchant2Error(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
          }
          }
      }
      if (player == 2){
         if (EnchantHold == 1){
          if (Enchanments.enchant1.Type == player2location.shop.ShopType){
          EnchantCheck2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else {
         Enchant2Error(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         } 
         }
         if (EnchantHold == 2){
          if (Enchanments.enchant2.Type == player2location.shop.ShopType){
          EnchantCheck2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else {
         Enchant2Error(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         }
         }
         if (EnchantHold == 3){
          if (Enchanments.enchant3.Type == player2location.shop.ShopType){
          EnchantCheck2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else {
         Enchant2Error(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         }
         }
         if (EnchantHold == 4){
          if (Enchanments.enchant4.Type == player2location.shop.ShopType){
          EnchantCheck2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else {
         Enchant2Error(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         }
         }
         if (EnchantHold == 5){
          if (Enchanments.enchant5.Type == player2location.shop.ShopType){
          EnchantCheck2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
          }
          else {
          Enchant2Error(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
          }
          }
      }
      }
      private void EnchantCheck2(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, EnchantPark Enchanments,Hand Player1hand,Hand Player2hand,FlowPane FP, FlowPane FPD,dragon[] DragonArray){
      
      if (player == 1){
         if (EnchantHold == 1){
            if (Enchanments.enchant1.Meat <= P1Meat && Enchanments.enchant1.Plants <= P1Plants && Enchanments.enchant1.Breed <= P1Breed && Enchanments.enchant1.Iron <= P1Iron && Enchanments.enchant1.Gems <= P1Gems && Enchanments.enchant1.Potions <= P1Potion && Enchanments.enchant1.CostType == "All"){
            placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray); //here
            }
            else if (Enchanments.enchant1.CostType != "All"){
            EnchantMulti(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            else{
            Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            }
            if (EnchantHold == 2){
            if (Enchanments.enchant2.Meat <= P1Meat && Enchanments.enchant2.Plants <= P1Plants && Enchanments.enchant2.Breed <= P1Breed && Enchanments.enchant2.Iron <= P1Iron && Enchanments.enchant2.Gems <= P1Gems && Enchanments.enchant2.Potions <= P1Potion && Enchanments.enchant2.CostType == "All"){
            placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
            }
            else if (Enchanments.enchant1.CostType != "All"){
            EnchantMulti(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            else{
            Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            }
            if (EnchantHold == 3){
            if (Enchanments.enchant3.Meat <= P1Meat && Enchanments.enchant3.Plants <= P1Plants && Enchanments.enchant3.Breed <= P1Breed && Enchanments.enchant3.Iron <= P1Iron && Enchanments.enchant3.Gems <= P1Gems && Enchanments.enchant3.Potions <= P1Potion && Enchanments.enchant3.CostType == "All"){
            placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
            }
            else if (Enchanments.enchant1.CostType != "All"){
            EnchantMulti(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            else{
            Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            }
            if (EnchantHold == 4){
            if (Enchanments.enchant4.Meat <= P1Meat && Enchanments.enchant4.Plants <= P1Plants && Enchanments.enchant4.Breed <= P1Breed && Enchanments.enchant4.Iron <= P1Iron && Enchanments.enchant4.Gems <= P1Gems && Enchanments.enchant4.Potions <= P1Potion && Enchanments.enchant4.CostType == "All"){
            placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
            }
            else if (Enchanments.enchant1.CostType != "All"){
            EnchantMulti(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            else{
            Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            }
            if (EnchantHold == 5){
            if (Enchanments.enchant5.Meat <= P1Meat && Enchanments.enchant5.Plants <= P1Plants && Enchanments.enchant5.Breed <= P1Breed && Enchanments.enchant5.Iron <= P1Iron && Enchanments.enchant5.Gems <= P1Gems && Enchanments.enchant5.Potions <= P1Potion && Enchanments.enchant5.CostType == "All"){
            placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
            }
            else if (Enchanments.enchant1.CostType != "All"){
            EnchantMulti(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            else{
            Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            }
         }
      
      if (player == 2){
         if (EnchantHold == 1){
            if (Enchanments.enchant1.Meat <= P2Meat && Enchanments.enchant1.Plants <= P2Plants && Enchanments.enchant1.Breed <= P2Breed && Enchanments.enchant1.Iron <= P2Iron && Enchanments.enchant1.Gems <= P2Gems && Enchanments.enchant1.Potions <= P2Potion && Enchanments.enchant1.CostType == "All"){
            placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
            }
            else if (Enchanments.enchant1.CostType != "All"){
            EnchantMulti(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            else{
            Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            }
            if (EnchantHold == 2){
            if (Enchanments.enchant2.Meat <= P2Meat && Enchanments.enchant2.Plants <= P2Plants && Enchanments.enchant2.Breed <= P2Breed && Enchanments.enchant2.Iron <= P2Iron && Enchanments.enchant2.Gems <= P2Gems && Enchanments.enchant2.Potions <= P2Potion && Enchanments.enchant2.CostType == "All"){
            placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
            }
            else if (Enchanments.enchant1.CostType != "All"){
            EnchantMulti(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            else{
            Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            }
            if (EnchantHold == 3){
            if (Enchanments.enchant3.Meat <= P2Meat && Enchanments.enchant3.Plants <= P2Plants && Enchanments.enchant3.Breed <= P2Breed && Enchanments.enchant3.Iron <= P2Iron && Enchanments.enchant3.Gems <= P2Gems && Enchanments.enchant3.Potions <= P2Potion && Enchanments.enchant3.CostType == "All"){
            placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
            }
            else if (Enchanments.enchant1.CostType != "All"){
            EnchantMulti(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            else{
            Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            }
            if (EnchantHold == 4){
            if (Enchanments.enchant4.Meat <= P2Meat && Enchanments.enchant4.Plants <= P2Plants && Enchanments.enchant4.Breed <= P2Breed && Enchanments.enchant4.Iron <= P2Iron && Enchanments.enchant4.Gems <= P2Gems && Enchanments.enchant4.Potions <= P2Potion && Enchanments.enchant4.CostType == "All"){
            placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
            }
            else if (Enchanments.enchant1.CostType != "All"){
            EnchantMulti(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            else{
            Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            }
            if (EnchantHold == 5){
            if (Enchanments.enchant5.Meat <= P2Meat && Enchanments.enchant5.Plants <= P2Plants && Enchanments.enchant5.Breed <= P2Breed && Enchanments.enchant5.Iron <= P2Iron && Enchanments.enchant5.Gems <= P2Gems && Enchanments.enchant5.Potions <= P2Potion && Enchanments.enchant5.CostType == "All"){
            placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
            }
            else if (Enchanments.enchant1.CostType != "All"){
            EnchantMulti(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            else{
            Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
            }
            }
      }
      
      
      }
       private void EnchantMulti(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, EnchantPark Enchanments){
      Stage = "EnchantMulti";
      taInfo.setText("How many sets would you like to use\r\n1) 1\r\n2) 2\r\n3) 3\r\n 4) 4");
      Buttons[0].setDisable(false);
      Buttons[1].setDisable(false);
      Buttons[2].setDisable(false);
      Buttons[3].setDisable(false);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
      }
      
      private void EnchantMultiCheck(TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, EnchantPark Enchanments,Hand Player1hand,Hand Player2hand,FlowPane FP, FlowPane FPD,dragon[] DragonArray){
      int Meat = 0;
      int Plants = 0;
      int Breed = 0;
      int Iron = 0;
      int Gems = 0;
      int Potions = 0;
      
      if (EnchantHold == 1){
         Meat = Enchanments.enchant1.Meat;
         Plants = Enchanments.enchant1.Plants;
         Breed = Enchanments.enchant1.Breed;
         Iron = Enchanments.enchant1.Iron;
         Gems = Enchanments.enchant1.Gems;
         Potions = Enchanments.enchant1.Potions;
      }
      if (EnchantHold == 2){
         Meat = Enchanments.enchant2.Meat;
         Plants = Enchanments.enchant2.Plants;
         Breed = Enchanments.enchant2.Breed;
         Iron = Enchanments.enchant2.Iron;
         Gems = Enchanments.enchant2.Gems;
         Potions = Enchanments.enchant2.Potions;
      }
      if (EnchantHold == 3){
         Meat = Enchanments.enchant3.Meat;
         Plants = Enchanments.enchant3.Plants;
         Breed = Enchanments.enchant3.Breed;
         Iron = Enchanments.enchant3.Iron;
         Gems = Enchanments.enchant3.Gems;
         Potions = Enchanments.enchant3.Potions;
      }
      if (EnchantHold == 4){
         Meat = Enchanments.enchant4.Meat;
         Plants = Enchanments.enchant4.Plants;
         Breed = Enchanments.enchant4.Breed;
         Iron = Enchanments.enchant4.Iron;
         Gems = Enchanments.enchant4.Gems;
         Potions = Enchanments.enchant4.Potions;
      }
      if (EnchantHold == 5){
         Meat = Enchanments.enchant5.Meat;
         Plants = Enchanments.enchant5.Plants;
         Breed = Enchanments.enchant5.Breed;
         Iron = Enchanments.enchant5.Iron;
         Gems = Enchanments.enchant5.Gems;
         Potions = Enchanments.enchant5.Potions;
      }
      if (player == 1)
      if (EnchantMultiHold == 1){
         if(Meat <= P1Meat && Plants <= P1Plants && Breed <= P1Breed && Iron <= P1Iron && Gems <= P1Gems && Potions <= P1Potion){
         placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else{
         Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         }
         }
         if (EnchantMultiHold == 2){
         Meat = Meat * 2;
         Plants = Plants * 2;
         Breed = Breed * 2;
         Iron = Iron * 2;
         Gems = Gems * 2;
         Potions = Potions * 2;
         if(Meat <= P1Meat && Plants <= P1Plants && Breed <= P1Breed && Iron <= P1Iron && Gems <= P1Gems && Potions <= P1Potion){
         placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else{
         Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         }
         }
         if (EnchantMultiHold == 3){
         Meat = Meat * 3;
         Plants = Plants * 3;
         Breed = Breed * 3;
         Iron = Iron * 3;
         Gems = Gems * 3;
         Potions = Potions * 3;
         if(Meat <= P1Meat && Plants <= P1Plants && Breed <= P1Breed && Iron <= P1Iron && Gems <= P1Gems && Potions <= P1Potion){
         placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else{
         Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         }
         }
         if (EnchantMultiHold == 4){
         Meat = Meat * 4;
         Plants = Plants * 4;
         Breed = Breed * 4;
         Iron = Iron * 4;
         Gems = Gems * 4;
         Potions = Potions * 4;
         if(Meat <= P1Meat && Plants <= P1Plants && Breed <= P1Breed && Iron <= P1Iron && Gems <= P1Gems && Potions <= P1Potion){
         placeEnchant (taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments,Player1hand,Player2hand,FP,FPD,DragonArray);
         }
         else{
         Enchant2Error2(taInfo,Buttons,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,Enchanments);
         }
         }
      }
      private void placeEnchant (TextArea taInfo, Button[] Buttons,
      Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, EnchantPark Enchanments,Hand Player1hand,Hand Player2hand,FlowPane FP, FlowPane FPD,dragon[] DragonArray){
      if (player == 1){
       if (EnchantHold == 1){
         
            if (player1location.shop.enchant1 == null){
            player1location.shop.enchant1 = Enchanments.enchant1;
            }
            else if (player1location.shop.enchant2 == null){
            player1location.shop.enchant2 = Enchanments.enchant1;
            }
            if (player1location.shop.enchant3 == null){
            player1location.shop.enchant3 = Enchanments.enchant1;
            }
         
         if (Enchanments.enchant1.CostType == "All"){
         P1Breed = P1Breed - Enchanments.enchant1.Breed;
         P1Meat = P1Meat  -Enchanments.enchant1.Meat;
         P1Potion = P1Potion - Enchanments.enchant1.Potions;
         P1Iron = P1Iron - Enchanments.enchant1.Iron;
         P1Gems = P1Gems - Enchanments.enchant1.Gems;
         P1Plants = P1Plants - Enchanments.enchant1.Plants;
         
         if (Enchanments.enchant1.Reword1 == "Pointsx4"){
         P1Points = P1Points + 4;
         }
         else if (Enchanments.enchant1.Reword1 == "Pointsx6"){
         P1Points = P1Points + 6;
         }
         if (Enchanments.enchant1.Reword2 == "Dragon"){
         if (player == 1){
         Player1hand.HandDraw(DragonArray);
         Player1hand.HandUpdate(FP,FPD);
         }
         if (player == 2){
         Player2hand.HandDraw(DragonArray);
         Player2hand.HandUpdate(FP,FPD);
         }
         }
         }
         else{
         if (EnchantMultiHold == 1){
            P1Points = P1Points + 0;
         }
         else if (EnchantMultiHold == 2){
            P1Points = P1Points + 2;
         }
         else if (EnchantMultiHold == 3){
            P1Points = P1Points + 4;
         }
         else if (EnchantMultiHold == 4){
            P1Points = P1Points + 8;
         }
       }
       }
       if (EnchantHold == 2){
         
            if (player1location.shop.enchant1 == null){
            player1location.shop.enchant1 = Enchanments.enchant2;
            }
            else if (player1location.shop.enchant2 == null){
            player1location.shop.enchant2 = Enchanments.enchant2;
            }
            if (player1location.shop.enchant3 == null){
            player1location.shop.enchant3 = Enchanments.enchant2;
            }
            if (Enchanments.enchant2.CostType == "All"){
            P1Breed = P1Breed - Enchanments.enchant2.Breed;
         P1Meat = P1Meat -Enchanments.enchant2.Meat;
         P1Potion = P1Potion -Enchanments.enchant2.Potions;
         P1Iron = P1Iron -Enchanments.enchant2.Iron;
         P1Gems = P1Gems- Enchanments.enchant2.Gems;
         P1Plants = P1Plants -Enchanments.enchant2.Plants;
         
            if (Enchanments.enchant2.Reword1 == "Pointsx4"){
         P1Points = P1Points + 4;
         }
         else if (Enchanments.enchant2.Reword1 == "Pointsx6"){
         P1Points = P1Points + 6;
         }
         if (Enchanments.enchant2.Reword2 == "Dragon"){
         if (player == 1){
         Player1hand.HandDraw(DragonArray);
         Player1hand.HandUpdate(FP,FPD);
         }
         if (player == 2){
         Player2hand.HandDraw(DragonArray);
         Player2hand.HandUpdate(FP,FPD);
         }
         }
         }
         else{
         if (EnchantMultiHold == 1){
            P1Points = P1Points + 0;
         }
         else if (EnchantMultiHold == 2){
            P1Points = P1Points + 2;
         }
         else if (EnchantMultiHold == 3){
            P1Points = P1Points + 4;
         }
         else if (EnchantMultiHold == 4){
            P1Points = P1Points + 8;
         }
       }
       }
       if (EnchantHold == 3)
            if (player1location.shop.enchant1 == null){
            player1location.shop.enchant1 = Enchanments.enchant3;
            }
            else if (player1location.shop.enchant2 == null){
            player1location.shop.enchant2 = Enchanments.enchant3;
            }
            if (player1location.shop.enchant3 == null){
            player1location.shop.enchant3 = Enchanments.enchant3;
            }
            if (Enchanments.enchant3.CostType == "All"){
            P1Breed = P1Breed - Enchanments.enchant3.Breed;
         P1Meat = P1Meat -Enchanments.enchant3.Meat;
         P1Potion = P1Potion -Enchanments.enchant3.Potions;
         P1Iron = P1Iron -Enchanments.enchant3.Iron;
         P1Gems = P1Gems -Enchanments.enchant3.Gems;
         P1Plants = P1Plants -Enchanments.enchant3.Plants;
         
            if (Enchanments.enchant3.Reword1 == "Pointsx4"){
         P1Points = P1Points + 4;
         }
         else if (Enchanments.enchant3.Reword1 == "Pointsx6"){
         P1Points = P1Points + 6;
         }
         if (Enchanments.enchant3.Reword2 == "Dragon"){
         if (player == 1){
         Player1hand.HandDraw(DragonArray);
         Player1hand.HandUpdate(FP,FPD);
         }
         if (player == 2){
         Player2hand.HandDraw(DragonArray);
         Player2hand.HandUpdate(FP,FPD);
         }
         }
         }
         else{
         if (EnchantMultiHold == 1){
            P1Points = P1Points + 0;
         }
         else if (EnchantMultiHold == 2){
            P1Points = P1Points + 2;
         }
         else if (EnchantMultiHold == 3){
            P1Points = P1Points + 4;
         }
         else if (EnchantMultiHold == 4){
            P1Points = P1Points + 8;
         }
       }
       }
       if (EnchantHold == 4){
         
            if (player1location.shop.enchant1 == null){
            player1location.shop.enchant1 = Enchanments.enchant4;
            }
            else if (player1location.shop.enchant2 == null){
            player1location.shop.enchant2 = Enchanments.enchant4;
            }
            if (player1location.shop.enchant3 == null){
            player1location.shop.enchant3 = Enchanments.enchant4;
            }
            if (Enchanments.enchant4.CostType == "All"){
            P1Breed = P1Breed - Enchanments.enchant4.Breed;
         P1Meat = P1Meat -Enchanments.enchant4.Meat;
         P1Potion = P1Potion -Enchanments.enchant4.Potions;
         P1Iron = P1Iron -Enchanments.enchant4.Iron;
         P1Gems = P1Gems -Enchanments.enchant4.Gems;
         P1Plants = P1Plants -Enchanments.enchant4.Plants;
         
            if (Enchanments.enchant4.Reword1 == "Pointsx4"){
         P1Points = P1Points + 4;
         }
         else if (Enchanments.enchant4.Reword1 == "Pointsx6"){
         P1Points = P1Points + 6;
         }
         if (Enchanments.enchant4.Reword2 == "Dragon"){
         if (player == 1){
         Player1hand.HandDraw(DragonArray);
         Player1hand.HandUpdate(FP,FPD);
         }
         if (player == 2){
         Player2hand.HandDraw(DragonArray);
         Player2hand.HandUpdate(FP,FPD);
         }
         }
         }
         else{
         if (EnchantMultiHold == 1){
            P1Points = P1Points + 0;
         }
         else if (EnchantMultiHold == 2){
            P1Points = P1Points + 2;
         }
         else if (EnchantMultiHold == 3){
            P1Points = P1Points + 4;
         }
         else if (EnchantMultiHold == 4){
            P1Points = P1Points + 8;
         }
       }
       }
       if (EnchantHold == 5){
            if (player1location.shop.enchant1 == null){
            player1location.shop.enchant1 = Enchanments.enchant5;
            }
            else if (player1location.shop.enchant2 == null){
            player1location.shop.enchant2 = Enchanments.enchant5;
            }
            if (player1location.shop.enchant3 == null){
            player1location.shop.enchant3 = Enchanments.enchant5;
            }
            if (Enchanments.enchant5.CostType == "All"){
            P1Breed = P1Breed - Enchanments.enchant5.Breed;
         P1Meat = P1Meat -Enchanments.enchant5.Meat;
         P1Potion = P1Potion -Enchanments.enchant5.Potions;
         P1Iron = P1Iron -Enchanments.enchant5.Iron;
         P1Gems = P1Gems -Enchanments.enchant5.Gems;
         P1Plants = P1Plants -Enchanments.enchant5.Plants;
            if (Enchanments.enchant5.Reword1 == "Pointsx4"){
         P1Points = P1Points + 4;
         }
         else if (Enchanments.enchant5.Reword1 == "Pointsx6"){
         P1Points = P1Points + 6;
         }
         if (Enchanments.enchant5.Reword2 == "Dragon"){
         if (player == 1){
         Player1hand.HandDraw(DragonArray);
         Player1hand.HandUpdate(FP,FPD);
         }
         if (player == 2){
         Player2hand.HandDraw(DragonArray);
         Player2hand.HandUpdate(FP,FPD);
         }
         }
         }
         else{
         if (EnchantMultiHold == 1){
            P1Points = P1Points + 0;
         }
         else if (EnchantMultiHold == 2){
            P1Points = P1Points + 2;
         }
         else if (EnchantMultiHold == 3){
            P1Points = P1Points + 4;
         }
         else if (EnchantMultiHold == 4){
            P1Points = P1Points + 8;
         }
         }
         }
         
         if (player == 2){
       if (EnchantHold == 1){
         
            if (player2location.shop.enchant1 == null){
            player2location.shop.enchant1 = Enchanments.enchant1;
            }
            else if (player2location.shop.enchant2 == null){
            player1location.shop.enchant2 = Enchanments.enchant1;
            }
            if (player2location.shop.enchant3 == null){
            player2location.shop.enchant3 = Enchanments.enchant1;
            }
         
         if (Enchanments.enchant1.CostType == "All"){
         P2Breed = P2Breed - Enchanments.enchant1.Breed;
         P2Meat = P2Meat -Enchanments.enchant1.Meat;
         P2Potion = P2Potion -Enchanments.enchant1.Potions;
         P2Iron = P2Iron -Enchanments.enchant1.Iron;
         P2Gems = P2Gems -Enchanments.enchant1.Gems;
         P2Plants = P2Plants -Enchanments.enchant1.Plants;
         if (Enchanments.enchant1.Reword1 == "Pointsx4"){
         P2Points = P2Points + 4;
         }
         else if (Enchanments.enchant1.Reword1 == "Pointsx6"){
         P2Points = P2Points + 6;
         }
         if (Enchanments.enchant1.Reword2 == "Dragon"){
         if (player == 1){
         Player1hand.HandDraw(DragonArray);
         Player1hand.HandUpdate(FP,FPD);
         }
         if (player == 2){
         Player2hand.HandDraw(DragonArray);
         Player2hand.HandUpdate(FP,FPD);
         }
         }
         }
         else{
         if (EnchantMultiHold == 1){
            P2Points = P2Points + 0;
         }
         else if (EnchantMultiHold == 2){
            P2Points = P2Points + 2;
         }
         else if (EnchantMultiHold == 3){
            P2Points = P2Points + 4;
         }
         else if (EnchantMultiHold == 4){
            P2Points = P2Points + 8;
         }
       }
       }
       
       if (EnchantHold == 2){
         
            if (player2location.shop.enchant1 == null){
            player2location.shop.enchant1 = Enchanments.enchant2;
            }
            else if (player2location.shop.enchant2 == null){
            player2location.shop.enchant2 = Enchanments.enchant2;
            }
            if (player2location.shop.enchant3 == null){
            player2location.shop.enchant3 = Enchanments.enchant2;
            }
            if (Enchanments.enchant2.CostType == "All"){
            P2Breed = P2Breed - Enchanments.enchant2.Breed;
         P2Meat = P2Meat -Enchanments.enchant2.Meat;
         P2Potion = P2Potion -Enchanments.enchant2.Potions;
         P2Iron = P2Iron -Enchanments.enchant2.Iron;
         P2Gems = P2Gems -Enchanments.enchant2.Gems;
         P2Plants = P2Plants -Enchanments.enchant2.Plants;
            if (Enchanments.enchant2.Reword1 == "Pointsx4"){
         P2Points = P2Points + 4;
         }
         else if (Enchanments.enchant2.Reword1 == "Pointsx6"){
         P2Points = P2Points + 6;
         }
         if (Enchanments.enchant2.Reword2 == "Dragon"){
         if (player == 1){
         Player1hand.HandDraw(DragonArray);
         Player1hand.HandUpdate(FP,FPD);
         }
         if (player == 2){
         Player2hand.HandDraw(DragonArray);
         Player2hand.HandUpdate(FP,FPD);
         }
         }
         }
         else{
         if (EnchantMultiHold == 1){
            P2Points = P2Points + 0;
         }
         else if (EnchantMultiHold == 2){
            P2Points = P2Points + 2;
         }
         else if (EnchantMultiHold == 3){
            P2Points = P2Points + 4;
         }
         else if (EnchantMultiHold == 4){
            P2Points = P2Points + 8;
         }
       }
       }
       if (EnchantHold == 3){
         
            if (player2location.shop.enchant1 == null){
            player2location.shop.enchant1 = Enchanments.enchant3;
            }
            else if (player2location.shop.enchant2 == null){
            player2location.shop.enchant2 = Enchanments.enchant3;
            }
            if (player2location.shop.enchant3 == null){
            player2location.shop.enchant3 = Enchanments.enchant3;
            }
            if (Enchanments.enchant3.CostType == "All"){
            P2Breed = P2Breed - Enchanments.enchant3.Breed;
         P2Meat = P2Meat -Enchanments.enchant3.Meat;
         P2Potion = P2Potion -Enchanments.enchant3.Potions;
         P2Iron = P2Iron -Enchanments.enchant3.Iron;
         P2Gems = P2Gems -Enchanments.enchant3.Gems;
         P2Plants = P2Plants -Enchanments.enchant3.Plants;
            if (Enchanments.enchant3.Reword1 == "Pointsx4"){
         P2Points = P2Points + 4;
         }
         else if (Enchanments.enchant3.Reword1 == "Pointsx6"){
         P2Points = P2Points + 6;
         }
         if (Enchanments.enchant3.Reword2 == "Dragon"){
         if (player == 1){
         Player1hand.HandDraw(DragonArray);
         Player1hand.HandUpdate(FP,FPD);
         }
         if (player == 2){
         Player2hand.HandDraw(DragonArray);
         Player2hand.HandUpdate(FP,FPD);
         }
         }
         }
         else{
         if (EnchantMultiHold == 1){
            P2Points = P2Points + 0;
         }
         else if (EnchantMultiHold == 2){
            P2Points = P2Points + 2;
         }
         else if (EnchantMultiHold == 3){
            P2Points = P2Points + 4;
         }
         else if (EnchantMultiHold == 4){
            P2Points = P2Points + 8;
         }
       }
       }
       if (EnchantHold == 4){
         
            if (player2location.shop.enchant1 == null){
            player2location.shop.enchant1 = Enchanments.enchant4;
            }
            else if (player2location.shop.enchant2 == null){
            player2location.shop.enchant2 = Enchanments.enchant4;
            }
            if (player2location.shop.enchant3 == null){
            player2location.shop.enchant3 = Enchanments.enchant4;
            }
            if (Enchanments.enchant4.CostType == "All"){
            P2Breed = P2Breed - Enchanments.enchant4.Breed;
         P2Meat = P2Meat -Enchanments.enchant4.Meat;
         P2Potion = P2Potion -Enchanments.enchant4.Potions;
         P2Iron = P2Iron -Enchanments.enchant4.Iron;
         P2Gems = P2Gems -Enchanments.enchant4.Gems;
         P2Plants = P2Plants -Enchanments.enchant1.Plants;
            if (Enchanments.enchant4.Reword1 == "Pointsx4"){
         P2Points = P2Points + 4;
         }
         else if (Enchanments.enchant4.Reword1 == "Pointsx6"){
         P2Points = P2Points + 6;
         }
         if (Enchanments.enchant4.Reword2 == "Dragon"){
         if (player == 1){
         Player1hand.HandDraw(DragonArray);
         Player1hand.HandUpdate(FP,FPD);
         }
         if (player == 2){
         Player2hand.HandDraw(DragonArray);
         Player2hand.HandUpdate(FP,FPD);
         }
         }
         }
         else{
         if (EnchantMultiHold == 1){
            P2Points = P2Points + 0;
         }
         else if (EnchantMultiHold == 2){
            P2Points = P2Points + 2;
         }
         else if (EnchantMultiHold == 3){
            P2Points = P2Points + 4;
         }
         else if (EnchantMultiHold == 4){
            P2Points = P2Points + 8;
         }
       }
       }
       if (EnchantHold == 5){
         
            if (player2location.shop.enchant1 == null){
            player2location.shop.enchant1 = Enchanments.enchant5;
            }
            else if (player2location.shop.enchant2 == null){
            player2location.shop.enchant2 = Enchanments.enchant5;
            }
            if (player2location.shop.enchant3 == null){
            player2location.shop.enchant3 = Enchanments.enchant5;
            }
            if (Enchanments.enchant5.CostType == "All"){
            P2Breed = P2Breed - Enchanments.enchant5.Breed;
         P2Meat = P2Meat -Enchanments.enchant5.Meat;
         P2Potion = P2Potion -Enchanments.enchant5.Potions;
         P2Iron = P2Iron -Enchanments.enchant5.Iron;
         P2Gems = P2Gems -Enchanments.enchant5.Gems;
         P2Plants = P2Plants -Enchanments.enchant5.Plants;
            if (Enchanments.enchant5.Reword1 == "Pointsx4"){
         P2Points = P2Points + 4;
         }
         else if (Enchanments.enchant5.Reword1 == "Pointsx6"){
         P2Points = P2Points + 6;
         }
         if (Enchanments.enchant5.Reword2 == "Dragon"){
         if (player == 1){
         Player1hand.HandDraw(DragonArray);
         Player1hand.HandUpdate(FP,FPD);
         }
         if (player == 2){
         Player2hand.HandDraw(DragonArray);
         Player2hand.HandUpdate(FP,FPD);
         }
         }
         }
         
         else{
         if (EnchantMultiHold == 1){
            P2Points = P2Points + 0;
         }
         else if (EnchantMultiHold == 2){
            P2Points = P2Points + 2;
         }
         else if (EnchantMultiHold == 3){
            P2Points = P2Points + 4;
         }
         else if (EnchantMultiHold == 4){
            P2Points = P2Points + 8;
         }
         }
       }
      }
      EnchantFire(taInfo,Buttons);
      }
      private void EnchantFire(TextArea taInfo, Button[] Buttons){
      Stage = "EnchantEnd";
      taInfo.setText("sorry next part not set up \r\n1)Continue");
      Buttons[0].setDisable(false);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);

      }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//End Game
   private void EndGame(TextArea taInfo,FlowPane FPP1, GridPane P1,FlowPane FPP2, GridPane P2, Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12,ArrayList<Shop> ShopArray,
   FlowPane FP, FlowPane FPD, dragon[] DragonArray, Park DragonPark,GridPane pane,FlowPane EFP, FlowPane EFPD, ArrayList<Enchant> EnchantArray, EnchantPark Enchanments,Button[] Buttons){
   itemCheck(FPP1,P1,FPP2,P2);
   CompltedShops(location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,ShopArray,pane);
   DragonPark.ParkUpdate(FP,FPD,DragonArray);
   Enchanments.EnchantParkUpdate(EFP,EFPD,EnchantArray);
   NextPlayer(taInfo,Buttons);
   }
   
   private void itemCheck(FlowPane FPP1, GridPane P1,FlowPane FPP2, GridPane P2){
   if (player == 1){
      if (P1Breed >= 7){
      P1Breed = 7;
      }
      if (P1Meat >= 7){
      P1Meat = 7;
      }
      if (P1Potion >= 7){
      P1Potion = 7;
      }
      if (P1Iron >= 7){
      P1Iron = 7;
      }
      if (P1Gems >= 7){
      P1Gems = 7;
      }
      if (P1Plants >= 7){
      P1Plants = 7;
      }
    }
      
    if (player == 2){
      if (P2Breed >= 7){
      P2Breed = 7;
      }
      if (P2Meat >= 7){
      P2Meat = 7;
      }
      if (P2Potion >= 7){
      P2Potion = 7;
      }
      if (P2Iron >= 7){
      P2Iron = 7;
      }
      if (P2Gems >= 7){
      P2Gems = 7;
      }
      if (P2Plants >= 7){
      P2Plants = 7;
      }
    }
   }
   int NumofShop = 0;
   private void CompltedShops(Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12,ArrayList<Shop> ShopArray, GridPane pane){
   NumofShop = 0;
   if (location1.shop.Dragon1 != null && location1.shop.Dragon2 != null && location1.shop.Dragon3 != null && location1.Complted !=2){
   location1.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location2.shop.Dragon1 != null && location2.shop.Dragon2 != null && location2.shop.Dragon3 != null && location2.Complted !=2){
   location2.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location3.shop.Dragon1 != null && location3.shop.Dragon2 != null && location3.shop.Dragon3 != null && location3.Complted !=2){
   location3.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location4.shop.Dragon1 != null && location4.shop.Dragon2 != null && location4.shop.Dragon3 != null && location4.Complted !=2){
   location4.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location5.shop.Dragon1 != null && location5.shop.Dragon2 != null && location5.shop.Dragon3 != null && location5.Complted !=2){
   location5.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location6.shop.Dragon1 != null && location6.shop.Dragon2 != null && location6.shop.Dragon3 != null && location6.Complted !=2){
   location6.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location7.shop.Dragon1 != null && location7.shop.Dragon2 != null && location7.shop.Dragon3 != null && location7.Complted !=2){
   location7.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location8.shop.Dragon1 != null && location8.shop.Dragon2 != null && location8.shop.Dragon3 != null && location8.Complted !=2){
   location8.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location9.shop.Dragon1 != null && location9.shop.Dragon2 != null && location9.shop.Dragon3 != null && location9.Complted !=2){
   location9.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location10.shop.Dragon1 != null && location10.shop.Dragon2 != null && location10.shop.Dragon3 != null && location10.Complted !=2){
   location10.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location11.shop.Dragon1 != null && location11.shop.Dragon2 != null && location11.shop.Dragon3 != null && location11.Complted !=2){
   location11.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   if (location12.shop.Dragon1 != null && location12.shop.Dragon2 != null && location12.shop.Dragon3 != null && location12.Complted !=2){
   location12.Complted = 2;
   NumofShop = NumofShop + 1;
   System.out.println("1");
   }
   NewShop(pane,location1,location2,location3,location4,location5,location6,location7,location8,location9,location10,location11,location12,ShopArray);
   }
   private void NewShop(GridPane pane,Location location1,Location location2,Location location3,Location location4,Location location5,Location location6,Location location7,Location location8,Location location9,Location location10,Location location11,Location location12, ArrayList<Shop> ShopArray){
   System.out.println("newShop");
   int length = ShopArray.size();
   for (int i = NumofShop; i > 0; i--) {
   System.out.println("newShop1");
   if(location1.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location1.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location1.GetImage();
      pane.add(location1.GetImage(), 1, 0);
   }
   else if(location2.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location2.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location2.GetImage();
      pane.add(location2.GetImage(), 2, 0);
   }
   else if(location3.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location3.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location3.GetImage();
       pane.add(location3.GetImage(), 3, 0);
   }
   else if(location4.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location4.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location4.GetImage();
      pane.add(location4.GetImage(), 4, 0);
   }
   else if(location5.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location5.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location5.GetImage();
      pane.add(location5.GetImage(), 5, 0);
   }
   else if(location6.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location6.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location6.GetImage();
      pane.add(location6.GetImage(), 6, 0);
   }
    else if(location7.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location7.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location7.GetImage();
      pane.add(location7.GetImage(), 1, 2);
      }
   else if(location8.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location8.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location8.GetImage();
      pane.add(location8.GetImage(), 2, 2);
   }
   else if(location9.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location9.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location9.GetImage();
      pane.add(location9.GetImage(), 3, 2);
   }
   else if(location10.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location10.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location10.GetImage();
      pane.add(location10.GetImage(), 4, 2);
   }
   else if(location11.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location11.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location11.GetImage();
      pane.add(location11.GetImage(), 5, 2);
   }
   else if(location12.shop.ShopName == "Notthing here"){
      Random rand = new Random();
      int int1 = rand.nextInt(length);
      location12.shop = ShopArray.get(int1);
      ShopArray.remove(int1);
      location12.GetImage();
      pane.add(location12.GetImage(), 6, 2);
   }
   }
   }
   private void NextPlayer(TextArea taInfo, Button[] Buttons){
   Stage = "End";
    Buttons[0].setDisable(false);
      Buttons[1].setDisable(true);
      Buttons[2].setDisable(true);
      Buttons[3].setDisable(true);
      Buttons[4].setDisable(true);
      Buttons[5].setDisable(true);
      Buttons[6].setDisable(true);
      Buttons[7].setDisable(true);
      Buttons[8].setDisable(true);
      Buttons[9].setDisable(true);
      Buttons[10].setDisable(true);
      Buttons[11].setDisable(true);
   if (player == 1){
   taInfo.setText("Start Player 2 trun. Ready? \r\n1)Start");
   player = 2;
   }
   else if (player == 2){
   taInfo.setText("Start Player 1 trun. Ready? \r\n1)Start");
   player = 1;
   }
   }
   
///////////////////////////////////////////////////////////////////////////////////////////      
      //Classes
      public class dragon{
      String DragonsName;
      String DragonsType;
      Image DragonImage;
      
      public dragon(String name, String type){
      DragonsName = name;
      DragonsType = type;
      }
      
      public ImageView GetImage(){
      ImageView imageView = new ImageView(DragonImage);
      //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(100); 
      imageView.setFitWidth(100); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
      return imageView;
      }   
      public void Gather()
      {
      if (player == 1)
      {
      if (DragonsType == "Breed"){
      P1Breed =  P1Breed + 1;
      }
      if (DragonsType == "Meat"){
      P1Meat = P1Meat + 1;
      }
      if (DragonsType == "Potion"){
      P1Potion = P1Potion + 1;
      }
      if (DragonsType == "Iron")
      P1Iron = P1Iron + 1;
      
      if (DragonsType == "Gem"){
      P1Gems = P1Gems + 1;
      }
      if (DragonsType == "Plant"){
      P1Plants = P1Plants + 1 ;
      }
      }
      
      if (player == 2)
      {
      if (DragonsType == "Breed"){
      P2Breed =  P2Breed + 1;
      }
      if (DragonsType == "Meat"){
      P2Meat = P2Meat + 1;
      }
      if (DragonsType == "Potion"){
      P2Potion = P2Potion + 1;
      }
      if (DragonsType == "Iron")
      P2Iron = P2Iron + 1;
      
      if (DragonsType == "Gem"){
      P2Gems = P2Gems + 1;
      }
      if (DragonsType == "Plant"){
      P2Plants = P2Plants + 1 ;
      }
      }
      } 
      }
///////////////////////////////////////////////////////////////////////////////////////////////      
      public class Shop{
      String ShopName;
      String ShopType;
      Image ShopImage;
      String slot1Type1;
      String slot1Type2;
      String slot2Type1;
      String slot2Type2;
      String slot3Type1;
      String slot3Type2;
      String slot1reword;
      String slot2reword;
      String slot3reword;
      dragon Dragon1;
      dragon Dragon2;
      dragon Dragon3;
      Enchant enchant1;
      Enchant enchant2;
      Enchant enchant3;
      boolean ShopAbility;
      
      public Shop (String name, String type, String slot1T,String slot1T2,String slot2T,String slot2T2,String slot3T,String slot3T2,String slot1r,String slot2r,String slot3r,boolean shopAbility){
      ShopName = name;
      ShopType = type;
      slot1Type1 = slot1T;
      slot1Type2 = slot1T2;
      slot2Type1 = slot2T;
      slot2Type2 = slot2T2;
      slot3Type1 = slot3T;
      slot3Type2 = slot3T2;
      slot1reword = slot1r;
      slot2reword = slot2r;
      slot3reword = slot3r;
      Enchant enchant1;
      Enchant enchant2;
      Enchant enchant3;
      ShopAbility = shopAbility;
      }
      
      public ImageView GetImage(){
      ImageView imageView = new ImageView(ShopImage);
      //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(200); 
      imageView.setFitWidth(200); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
      return imageView;
      }
      public void UpdateDragons(FlowPane FP, FlowPane FPD){
      FP.getChildren().remove(FPD);
      FPD.getChildren().clear();
      if (Dragon1 != null){
         FPD.getChildren().add(Dragon1.GetImage());
      }
      else {
      FPD.getChildren().add(DragonBack());
      }
      if (Dragon2 != null){
         FPD.getChildren().add(Dragon2.GetImage());
      }
      else {
      FPD.getChildren().add(DragonBack());
      }
      if (Dragon3 != null){
         FPD.getChildren().add(Dragon3.GetImage());
      }
      else {
      FPD.getChildren().add(DragonBack());
      }

      FP.getChildren().add(FPD);
      }
            
      private void Gather(){
      if (player == 1)
      {
      if (ShopType == "Breed"){
      P1Breed =  P1Breed + 1;
      }
      if (ShopType == "Meat"){
      P1Meat = P1Meat + 1;
      }
      if (ShopType == "Potion"){
      P1Potion = P1Potion + 1;
      }
      if (ShopType == "Iron")
      P1Iron = P1Iron + 1;
      
      if (ShopType == "Gem"){
      P1Gems = P1Gems + 1;
      }
      if (ShopType == "Plant"){
      P1Plants = P1Plants + 1 ;
      }
      }
      if (player == 2)
      {
      if (ShopType == "Breed"){
      P2Breed =  P2Breed + 1;
      }
      if (ShopType == "Meat"){
      P2Meat = P2Meat + 1;
      }
      if (ShopType == "Potion"){
      P2Potion = P2Potion + 1;
      }
      if (ShopType == "Iron")
      P2Iron = P2Iron + 1;
      
      if (ShopType == "Gem"){
      P2Gems = P2Gems + 1;
      }
      if (ShopType == "Plant"){
      P2Plants = P2Plants + 1 ;
      }
      }
      if (enchant1 != null){
      enchant1.Gather();
      }
      if (enchant2 != null){
      enchant2.Gather();
      }
      if (enchant3 != null){
      enchant3.Gather();
      }
      if (Dragon1 != null){
      Dragon1.Gather();
      }
      if (Dragon2 != null){
      Dragon2.Gather();
      }
      if (Dragon3 != null){
      Dragon3.Gather();
      }
      }
      }
/////////////////////////////////////////////////////////////////////////////////////////////////      
     public class Location{
     Shop shop;
     int Complted;
     
     public Location(Shop s){
     shop = s;
     Complted = 1;
     } 
     
     public ImageView GetImage(){
     if(shop != null){
     ImageView imageView = shop.GetImage();
     return imageView;
     }
     else{
     Image image = new Image("pics\\Shopback.jpg");
     ImageView imageView = new ImageView(image);
    //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(200); 
      imageView.setFitWidth(200); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
      return imageView;
     
     }
     }
     }
////////////////////////////////////////////////////////////////////////////////////////////////
      public class Park{
      dragon Dragon1;
      dragon Dragon2;
      dragon Dragon3;
      dragon Dragon4;
      dragon Dragon5;
      
      public Park(){
      Dragon1 = null;
      Dragon2 = null;
      Dragon3 = null;
      Dragon4 = null;
      Dragon5 = null;
      }
      
   private void ParkUpdate(FlowPane FP, FlowPane FPD, dragon[] DragonArray){
   int length = DragonArray.length;
   if (Dragon1 == null)
   {
   Random rand = new Random();
   int int1 = rand.nextInt(length);
   Dragon1 = DragonArray[int1];
   for (int i = int1; i < DragonArray.length - 1; i++) {
    DragonArray[i] = DragonArray[i + 1];
   }
   length = DragonArray.length;
   }
   if (Dragon2 == null)
   {
   Random rand = new Random();
   int int2 = rand.nextInt(length);
   Dragon2 = DragonArray[int2];
   for (int i = int2; i < DragonArray.length - 1; i++) {
    DragonArray[i] = DragonArray[i + 1];
   }
   length = DragonArray.length;

   }
   if (Dragon3 == null)
   {
   Random rand = new Random();
   int int3 = rand.nextInt(length);
   Dragon3 = DragonArray[int3];
   for (int i = int3; i < DragonArray.length - 1; i++) {
    DragonArray[i] = DragonArray[i + 1];
   }
   length = DragonArray.length;

   }
   
   if (Dragon4 == null)
   {
   Random rand = new Random();
   int int4 = rand.nextInt(length);
   Dragon4 = DragonArray[int4];
   for (int i = int4; i < DragonArray.length - 1; i++) {
    DragonArray[i] = DragonArray[i + 1];
   }
   length = DragonArray.length;

   }
   if (Dragon5 == null)
   {
   Random rand = new Random();
   int int5 = rand.nextInt(length);
   Dragon5 = DragonArray[int5];
   for (int i = int5; i < DragonArray.length - 1; i++) {
    DragonArray[i] = DragonArray[i + 1];
   }
   length = DragonArray.length;

   }
   FPD.getChildren().clear();
   FPD.getChildren().add(Dragon1.GetImage());
   FPD.getChildren().add(Dragon2.GetImage());
   FPD.getChildren().add(Dragon3.GetImage());
   FPD.getChildren().add(Dragon4.GetImage());
   FPD.getChildren().add(Dragon5.GetImage());
   //FP.getChildren().add(FPD);

   }
   }
////////////////////////////////////////////////////////////////////////      
  public class Hand{
      List<dragon> DragonHand;
      
      public Hand(dragon x){
      DragonHand = new ArrayList<dragon>();
      DragonHand.add(x);
      }
   private void HandDraw(dragon[] DragonArray){ 
   int length = DragonArray.length;
   Random rand = new Random();
   int int1 = rand.nextInt(length);
   dragon Dragon1 = DragonArray[int1];
   DragonHand.add(Dragon1);
   for (int i = int1; i < DragonArray.length - 1; i++) {
    DragonArray[i] = DragonArray[i + 1];
   
   }
      }
      private void HandUpdate(FlowPane FP, FlowPane FPD){
      FP.getChildren().remove(FPD);
      FPD.getChildren().clear();
   for (dragon d : DragonHand) {
    FPD.getChildren().add(d.GetImage());
   }
   
   FP.getChildren().add(FPD);
   }
   }
//////////////////////////////////////////////////////////////////////////////////////////
   public class Enchant{
     String EnchantName;
     int Meat;
     int Plants;
     int Breed;
     int Iron;
     int Gems;
     int Potions;
     String Type;
     String Reword1;
     String Reword2;
     Image EnchantImage;
     String CostType;
     
     public Enchant(String enchantName, int meat,int plants, int breed, int iron, int gems, int potions, String type, String reword1, String reword2,String costType){
     EnchantName = enchantName;
     Meat = meat;
     Plants = plants;
     Breed = breed;
     Iron = iron;
     Gems = gems;
     Potions = potions;
     Type = type;
     Reword1 = reword1;
     Reword2 = reword2;
     CostType = costType;
     }
      public ImageView GetImage(){
      ImageView imageView = new ImageView(EnchantImage);
      //Setting the position of the image 
      imageView.setX(50); 
      imageView.setY(25); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(100); 
      imageView.setFitWidth(100); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true);  
      return imageView;
      }
      private void Gather(){
      if (player == 1)
      {
      if (Type == "Breed"){
      P1Breed =  P1Breed + 1;
      }
      if (Type == "Meat"){
      P1Meat = P1Meat + 1;
      }
      if (Type == "Potion"){
      P1Potion = P1Potion + 1;
      }
      if (Type == "Iron")
      P1Iron = P1Iron + 1;
      
      if (Type == "Gem"){
      P1Gems = P1Gems + 1;
      }
      if (Type == "Plant"){
      P1Plants = P1Plants + 1 ;
      }
      }
      if (player == 2)
      {
      if (Type == "Breed"){
      P2Breed =  P2Breed + 1;
      }
      if (Type == "Meat"){
      P2Meat = P2Meat + 1;
      }
      if (Type == "Potion"){
      P2Potion = P2Potion + 1;
      }
      if (Type == "Iron")
      P2Iron = P2Iron + 1;
      
      if (Type == "Gem"){
      P2Gems = P2Gems + 1;
      }
      if (Type == "Plant"){
      P2Plants = P2Plants + 1 ;
      }
      }
      }
   }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
   public class EnchantPark{
      Enchant enchant1;
      Enchant enchant2;
      Enchant enchant3;
      Enchant enchant4;
      Enchant enchant5;
      
      public EnchantPark(){
      enchant1 = null;
      enchant2 = null;
      enchant3 = null;
      enchant4 = null;
      enchant5 = null;
      }
      
   private void EnchantParkUpdate(FlowPane FP, FlowPane FPD, ArrayList<Enchant> EnchantArray){
   int length = EnchantArray.size();
   if (enchant1 == null)
   {
   Random rand = new Random();
   int int1 = rand.nextInt(length);
   enchant1 = EnchantArray.get(int1);
   EnchantArray.remove(int1);
   length = EnchantArray.size();
   }
   if (enchant2 == null)
   {
   Random rand = new Random();
   int int2 = rand.nextInt(length);
   enchant2 = EnchantArray.get(int2);
   EnchantArray.remove(int2);
   length = EnchantArray.size();
   }
   if (enchant3 == null)
   {
   Random rand = new Random();
   int int3 = rand.nextInt(length);
   enchant3 = EnchantArray.get(int3);
   EnchantArray.remove(int3);
   length = EnchantArray.size();
   }
   
   if (enchant4 == null)
   {
   Random rand = new Random();
   int int4 = rand.nextInt(length);
   enchant4 = EnchantArray.get(int4);
   EnchantArray.remove(int4);
   length = EnchantArray.size();
   }
   if (enchant5 == null)
   {
   Random rand = new Random();
   int int5 = rand.nextInt(length);
   enchant5 = EnchantArray.get(int5);
   EnchantArray.remove(int5);
   length = EnchantArray.size();
   }
   FPD.getChildren().clear();
   FPD.getChildren().add(enchant1.GetImage());
   FPD.getChildren().add(enchant2.GetImage());
   FPD.getChildren().add(enchant3.GetImage());
   FPD.getChildren().add(enchant4.GetImage());
   FPD.getChildren().add(enchant5.GetImage());
   //FP.getChildren().add(FPD);

   }
   }

 }