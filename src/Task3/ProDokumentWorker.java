package Task3;

public class ProDokumentWorker extends DokumentWorker {


    @Override
    void editDokument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    void saveDokument() {
        System.out.println("Документ сохранен в старом формате, сохранение в других форматах доступно в версии эксперт");
    }
}
