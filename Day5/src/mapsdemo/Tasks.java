package mapsdemo;
import java.util.*;
import java.util.Map.Entry;
public class Tasks 
{
  List<String> findpassed(Map<String,Integer>marks)
  {
	  List<String> obj=new ArrayList<>();
	  for(Entry<String,Integer> f:marks.entrySet())
	  {
		  if(f.getValue()>70);
			  
	  }
	return null;
	  
  }
  public static void main(String[] args) {
	
}
  {
	 Map <String,Integer> marks=new HashMap<String,Integer>();
	 marks.put("virat",90);
	 marks.put("jack",75);
	 marks.put("pal",60);
	 marks.put("nani",80);
	 Tasks obj=new Tasks();
	 System.out.println(obj.findpassed(marks));
	 
  }
}
