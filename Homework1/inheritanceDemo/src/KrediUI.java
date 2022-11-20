public class KrediUI {
    public void krediHesapla(BaseKrediManager baseKrediManager) {
        baseKrediManager.hesapla();
        // Button, TextBox vs. This is the User Interface.
    }

    // Info -> With the object referer of the Base class object, we can hold the RAM location of ,any of the subclass objects that inherit from it
    // and again with the object referer of the Base class object, we can access the behaviors/actions that subclass objects override from it.
    // This is polymorphism.

    //Info -> The purpose and importance of polymorphism is to be able to work with any of the subclass objects that do alternate jobs.
    // That is, it is to reduce dependencies. Being able to write extensible applications.

    // Info -> Polymorphism provides Extensibility and Testability.
}
