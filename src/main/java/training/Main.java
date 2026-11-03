package training;
import java.nio.file.*;
public class Main {
 public static void main(String[] args)throws Exception{
  Path p=Path.of(args.length>0?args[0]:"sample.log");long i=0,w=0,e=0;
  for(String l:Files.readAllLines(p)){if(l.contains("INFO"))i++;if(l.contains("WARN"))w++;if(l.contains("ERROR"))e++;}
  System.out.printf("INFO=%d WARN=%d ERROR=%d%n",i,w,e);
 }
}
