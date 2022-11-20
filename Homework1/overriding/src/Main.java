public class Main {
    public static void main(String[] args) {
       /* TarimKrediManager tarimKrediManager = new TarimKrediManager();
        System.out.println(tarimKrediManager.hesapla(1000));*/

        /*
         * If a subclass object does not override an action/behavior that it inherits from the Base class,
         * that action behaves as in the Base class.
         * */

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgrenciKrediManager(), new TarimKrediManager()};

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }

    }
}