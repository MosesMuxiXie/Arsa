/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class gwd
extends gwc {
    private static final yh a = yh.c("options.skinCustomisation.title");

    public gwd(gsb $$0, gfo $$1) {
        super($$0, $$1, a);
    }

    @Override
    protected void o() {
        ArrayList<gjc> $$0 = new ArrayList<gjc>();
        for (ddo $$12 : ddo.values()) {
            $$0.add(gjl.a(this.c.a($$12)).a($$12.e(), ($$1, $$2) -> this.c.a($$12, (boolean)$$2)));
        }
        $$0.add(this.c.D().a(this.c));
        this.d.b((List<gjc>)$$0);
    }
}

