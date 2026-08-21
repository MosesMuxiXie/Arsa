/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class bec {
    private final List<bed> a = new ArrayList<bed>();

    public static bec a() {
        return new bec();
    }

    public List<bed> b() {
        return List.copyOf(this.a);
    }

    public bec a(bed $$0) {
        this.a.add($$0);
        return this;
    }

    public bec a(amo $$0) {
        return this.a(bed.a($$0));
    }

    public bec b(amo $$0) {
        return this.a(bed.b($$0));
    }

    public bec c(amo $$0) {
        return this.a(bed.c($$0));
    }

    public bec d(amo $$0) {
        return this.a(bed.d($$0));
    }
}

