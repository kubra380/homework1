
public class AverageMeters extends HouseType {
double averagehouse;
public void setAverageHouse(double a,double b) {
this.averagehouse=a*b;
}
public double getAverageHouse() {
	return averagehouse;
}
public void HouseAverage() {
	System.out.println("Average Metres House:"+(averagehouse));
}
double averagevilla;
public void setAverageVilla(double d,double e) {
this.averagevilla=d*e;
}
public double getAverageVilla() {
return averagevilla;
}
public void VillaAverage() {
   System.out.println("Average Metres Villa:"+(averagevilla));
}
double averagesummerhouse;
public void setAverageSummerHouse(double g,double h) {
	this.averagesummerhouse=g*h;
}
public double getSummerHouse(){
	return averagesummerhouse;
}
public void SummerHouseAverage() {
	System.out.println("Average Metres SummerHouse:"+(averagesummerhouse));
}
public void generalaverage() {
double total=averagehouse+averagevilla+averagesummerhouse;
System.out.println("Average of all types:"+(total));
}
}