package task03;

import task03.repositories.DoubleRepository;
import task03.services.ResultWriter;
import task03.services.TgExecutor;

public class task03 {
    public static void main(String[] args) {
        var doubleRepository = new DoubleRepository();
        var a = doubleRepository.GetNextDouble();
        var b = doubleRepository.GetNextDouble();
        var h = doubleRepository.GetNextDouble();

        if (a >= b) {
            System.out.println("Error: a cannot be more then b");
            return;
        }

        var tgExecutor = new TgExecutor(a, b, h);
        var result = tgExecutor.execute();

        System.out.println("Result :\n" + ResultWriter.write(result));
    }
}
