package ihm.icoclassroom.observable;

public interface SujetoObservable {

    public void addObservable(Observador o);

    public void notifyObservables(Object arg);

    public void notifyObservables();
}
