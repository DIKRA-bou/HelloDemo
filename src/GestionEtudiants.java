import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        // إنشاء الطالب الأول lolo
        Etudiant lolo = new Etudiant("Dupont", "Laurent", 
            LocalDate.of(2000, Month.JANUARY, 1), 
            "laurent@email.com", "123 Rue Paris");
        
        // إنشاء مرجع ثاني يشير إلى نفس الكائن
        Etudiant toto = lolo;
        
        // إنشاء طالبين جديدين
        Etudiant fifi = new Etudiant("Martin", "Philippe",
            LocalDate.of(2001, Month.MARCH, 15),
            "philippe@email.com", "456 Rue Lyon");
            
        Etudiant riri = new Etudiant("Bernard", "Richard",
            LocalDate.of(2000, Month.DECEMBER, 10),
            "richard@email.com", "789 Rue Marseille");
            
        // إنشاء القسم
        Departement monDepInfo = new Departement("Informatique", "Université de Biskra");
        
        // طباعة رسالة قبل إضافة الطلاب
        System.out.println("Liste initiale des étudiants:");
        
        // تسجيل الطلاب
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(riri);
        
        // طباعة محتوى القسم
        System.out.println(monDepInfo);
        
        // إضافة سطر فارغ للفصل
        System.out.println();
        
        // طباعة رسالة قبل إلغاء التسجيل
        System.out.println("Après désinscription de toto:");
        
        // إلغاء تسجيل toto
        monDepInfo.desinscrire(toto);
        
        // طباعة محتوى القسم بعد إلغاء التسجيل
        System.out.println(monDepInfo);
    }
}