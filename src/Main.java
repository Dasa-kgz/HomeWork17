public class Main {
    public static void main(String[] args) {
        Java java = new Java("Dastan", 32,"Male","dasa-kgz@mail.ru");
        Java java1=new Java("Samat", 25,"Male","samat");
        Java java2=new Java("Gulira",18,"Female","gulira");
        Java java3=new Java("Bilal",15,"Male","qunaev");
        Java java4=new Java("Mirlan",25,"Male","mirlan");
        Java java5=new Java("Noor",27,"Male","noor");
        Java java6=new Java("Aidai",3,"Female","aidai");

        Android android=new Android("Tilek",2,"Male","tilek");
        Android android1=new Android("Meeim",27, "Female","meerim");
        Android android2=new Android("Nuna",22,"Female","nunnna");

        Go go = new Go("Baisal",17,"Male","baisal");
        Go go1=new Go("Ular",17,"Male","ulllar");
        Go go2=new Go("Nurik",17,"Male","nurrrrik");


        Java[]javas={java,java1,java2,java3,java4};
        Java[]javas1={java5,java6};
        Android[]androids={android,android1};
        Android[]androidsss={android2};
        Go[]goo={go,go1};
        Go[]gooo={go2};

        Company company=new Company("Batken","Digital World",javas,androids,goo);
        Company company1=new Company("Osh","Ramazan",javas1,androidsss,gooo);

        System.out.println(company);
        System.out.println(company1);
    }
}