/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class ikt {
    public final List<iks> a = new ArrayList<iks>();

    public void a() {
        this.a.forEach(iks::b);
        this.a.clear();
    }

    public void a(iks $$0) {
        this.a.add($$0);
    }

    public void a(hpp $$0, ikp $$1) {
        for (iks $$2 : this.a) {
            $$2.submit($$0, $$1);
        }
    }
}

