import java.time.*;
class DifferenceBetweenTwoDates
{
    public static void main(String[] args)
    {
        LocalDateTime d1=LocalDateTime.of(2020,12,1,11,20,20);
        LocalDateTime d2=LocalDateTime.of(2019,12,1,10,20,20);
        Duration d=Duration.between(d2,d1);
        System.out.println(d.getSeconds());
        LocalDate d3=LocalDate.of(2020,12,1);
        LocalDate d4=LocalDate.of(2010,12,3);
        Period p=Period.between(d4,d3);
        System.out.println(p.getDays());
        System.out.println(p.getMonths());
        System.out.println(p.getYears());
    }
}