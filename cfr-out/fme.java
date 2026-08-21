/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.util.HashSet;
import org.jspecify.annotations.Nullable;

public class fme
extends fml {
    public fme(egb $$0) {
        super($$0);
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable fmj $$3, boolean $$4) {
        int $$5 = this.c($$0, $$1);
        if ($$2.c(egb.f) != $$5) {
            if ($$0.a_($$1) == $$2) {
                $$0.a($$1, (eoh)$$2.b(egb.f, $$5), 2);
            }
            HashSet $$6 = Sets.newHashSet();
            $$6.add($$1);
            for (iz $$7 : iz.values()) {
                $$6.add($$1.a($$7));
            }
            for (is $$8 : $$6) {
                $$0.a($$8, this.a);
            }
        }
    }

    private int c(dwo $$0, is $$1) {
        int $$2 = this.a($$0, $$1);
        if ($$2 == 15) {
            return $$2;
        }
        return Math.max($$2, this.b($$0, $$1));
    }
}

