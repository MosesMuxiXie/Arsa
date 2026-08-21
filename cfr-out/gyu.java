/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class gyu
implements gyq,
gyr {
    private static final amo a = amo.b("spectator/teleport_to_player");
    private static final Comparator<hiq> b = Comparator.comparing($$0 -> $$0.a().id());
    private static final yh c = yh.c("spectatorMenu.teleport");
    private static final yh d = yh.c("spectatorMenu.teleport.prompt");
    private final List<gyr> e;

    public gyu() {
        this(gfj.V().R().n());
    }

    public gyu(Collection<hiq> $$02) {
        this.e = $$02.stream().filter($$0 -> $$0.e() != dwl.d).sorted(b).map(gyn::new).collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<gyr> a() {
        return this.e;
    }

    @Override
    public yh b() {
        return d;
    }

    @Override
    public void a(gyp $$0) {
        $$0.a(this);
    }

    @Override
    public yh bh_() {
        return c;
    }

    @Override
    public void a(gir $$0, float $$1, float $$2) {
        $$0.a(hpa.at, a, 0, 0, 16, 16, bel.a($$2, $$1, $$1, $$1));
    }

    @Override
    public boolean bi_() {
        return !this.e.isEmpty();
    }
}

