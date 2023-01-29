
public class Sum extends HouseType {
double sumhouse;
public void setSumHouse(double a,double b,double c) {
	this.sumhouse=a+b+c;
}
public double getSumHouse() {
	return sumhouse;	
}
public void HousePrice() {
	
	System.out.println("House Price:"+sumhouse);
}

double sumvilla;
public void setSumVillage(double d,double e,double f) {
	this.sumvilla=d+e+f;
}
public double getSumVilla(){
	return sumvilla;
}
public void VillagePrice() {
	System.out.println("Villa Price:"+sumvilla);
}


double sumsummer_house;
public void setSummer_House(double g,double h,double k) {
	this.sumsummer_house=g+h+k;
}
public double getSummer_House() {
	return sumsummer_house;
}
public void SummerHousePrice() {
	System.out.println("SummerHouse Price:"+(sumsummer_house));
}
public void generaltotal() {
	System.out.println("Genelral Total:"+ (sumhouse+sumvilla+sumsummer_house));
}
}
