/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class gey {
    private final hig a;
    private int b = -1;
    private @Nullable Consumer<uz> c;

    public gey(hig $$0) {
        this.a = $$0;
    }

    public boolean a(int $$0, @Nullable uz $$1) {
        if (this.b == $$0 && this.c != null) {
            this.c.accept($$1);
            this.c = null;
            return true;
        }
        return false;
    }

    private int a(Consumer<uz> $$0) {
        this.c = $$0;
        return ++this.b;
    }

    public void a(int $$0, Consumer<uz> $$1) {
        int $$2 = this.a($$1);
        this.a.b(new aix($$2, $$0));
    }

    public void a(is $$0, Consumer<uz> $$1) {
        int $$2 = this.a($$1);
        this.a.b(new aie($$2, $$0));
    }
}

