/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class pf {
    public static void a(String[] $$0) throws IOException {
        w.a(r.a);
        amv.a();
        for (String $$1 : $$0) {
            pf.a($$1);
        }
    }

    private static void a(String $$02) throws IOException {
        try (Stream<Path> $$1 = Files.walk(Paths.get($$02, new String[0]), new FileVisitOption[0]);){
            $$1.filter($$0 -> $$0.toString().endsWith(".snbt")).forEach($$0 -> {
                try {
                    String $$1 = Files.readString($$0);
                    uz $$2 = vo.a($$1);
                    uz $$3 = ph.a($$0.toString(), $$2);
                    pe.a(mo.a, $$0, vo.a($$3));
                }
                catch (CommandSyntaxException | IOException $$4) {
                    throw new RuntimeException($$4);
                }
            });
        }
    }
}

