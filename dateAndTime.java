/******************************************************************************************************************************
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

Example:
month:8
day=14
year=2017
The method should return MONDAY as the day on that date.

Returns

string: the day of the week in capital letters
Input Format

A single line of input containing the space separated month, day and year, respectively, in xx.xx.xxxx format
****************************************************************************************************************/
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance(); //İlk olarak bir Calendar nesnesi oluşturulur ve getInstance() yöntemi kullanılarak mevcut zamana ayarlanır.
        cal.set(year, month - 1, day);//Ardından, set() yöntemi kullanılarak, belirtilen yıl, ay ve gün bilgilerine göre takvim ayarlanır.

        String day1 = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
      //Daha sonra, getDisplayName() yöntemi kullanılarak, belirtilen takvim alanının adı (haftanın günü) belirtilir. 
      //İkinci parametre, takvim alanının uzun biçimde (LONG) veya kısa biçimde (SHORT) olacağını belirtir.
      //Üçüncü parametre, hangi yerelleştirme kurallarının kullanılacağını belirtir.

    return day1.toUpperCase();

    }

}
