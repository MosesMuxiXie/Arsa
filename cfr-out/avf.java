/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class avf {
    public static List<aue> a(auo $$02) {
        return $$02.a().a().stream().filter($$0 -> $$0.h() != null).map($$0 -> aue.a((bbx)$$0.h())).toList();
    }

    public static List<aue> a(auo $$0, List<aue> $$12, avh $$22) {
        List<CompletableFuture> $$3 = $$12.stream().map($$1 -> $$0.c().a($$1.a(), $$1.b())).toList();
        for (Optional $$4 : bhs.c($$3).join()) {
            $$4.ifPresent($$2 -> $$0.a().a(new bck((bbx)$$2), $$22));
        }
        return avf.a($$0);
    }

    public static List<aue> a(auo $$0, avh $$1) {
        $$0.a().a($$1);
        return avf.a($$0);
    }

    public static List<aue> b(auo $$0, List<aue> $$12, avh $$22) {
        List<CompletableFuture> $$3 = $$12.stream().map($$1 -> $$0.c().a($$1.a(), $$1.b())).toList();
        for (Optional $$4 : bhs.c($$3).join()) {
            $$4.ifPresent($$2 -> $$0.a().a((bbx)$$2, $$22));
        }
        $$0.a().b($$22);
        return avf.a($$0);
    }

    public static List<aue> c(auo $$0, List<aue> $$12, avh $$22) {
        List<CompletableFuture> $$3 = $$12.stream().map($$1 -> $$0.c().a($$1.a(), $$1.b())).toList();
        Set $$4 = bhs.c($$3).join().stream().flatMap(Optional::stream).collect(Collectors.toSet());
        Set $$5 = $$0.a().a().stream().map(bce::h).collect(Collectors.toSet());
        $$5.stream().filter($$1 -> !$$4.contains($$1)).forEach($$2 -> $$0.a().a((bbx)$$2, $$22));
        $$4.stream().filter($$1 -> !$$5.contains($$1)).forEach($$2 -> $$0.a().a(new bck((bbx)$$2), $$22));
        $$0.a().b($$22);
        return avf.a($$0);
    }
}

