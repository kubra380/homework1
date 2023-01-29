import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
public static void main(String[] arg) {
	
	Sum sum=new Sum();
	sum.setSumHouse(100000, 225000, 600000);
	sum.HousePrice();
	sum.setSumVillage(450000, 45000,85000);
	sum.VillagePrice();
	sum.setSummer_House(325007, 500000, 400000);
	sum.SummerHousePrice();
	sum.generaltotal();
	
	
	AverageMeters averagemeters=new AverageMeters();
	averagemeters.setAverageHouse(25, 60);
	averagemeters.HouseAverage();
	averagemeters.setAverageVilla(20, 30);
	averagemeters.VillaAverage();
	averagemeters.setAverageSummerHouse(30, 40);
	averagemeters.SummerHouseAverage();
	averagemeters.generalaverage();
	
	
	List<Filter> filterList=Arrays.asList(new Filter("HOUSE",4,5),new Filter("VİLLA",6,7),new Filter("SUMMERHOUSE",4,8));
	System.out.println("List of Housetype"+filterList);
	Stream<Filter> filterStream=filterList.stream();
	List<Filter> result=filterStream.collect(Collectors.filtering(objFilter ->objFilter.getRoom()>5,Collectors.toList()));
	Stream<Filter> filterStream2=filterList.stream();
	List<Filter> result2=filterStream2.collect(Collectors.filtering(objFilter ->objFilter.getHall()>5,Collectors.toList()));
	System.out.println("Result filtering the number of rooms:"+result);
	System.out.println("Result filtering the number of hall:"+result2);
		
}
}
