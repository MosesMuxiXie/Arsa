/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class dvm
extends ArrayList<dvl> {
    public static final Codec<dvm> a = dvl.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dvm::new, Function.identity()).codec();
    public static final aao<xq, dvm> b = dvl.b.a(aam.a(dvm::new));

    public dvm() {
    }

    private dvm(int $$0) {
        super($$0);
    }

    private dvm(Collection<dvl> $$0) {
        super($$0);
    }

    public @Nullable dvl a(dlt $$0, dlt $$1, int $$2) {
        if ($$2 > 0 && $$2 < this.size()) {
            dvl $$3 = (dvl)this.get($$2);
            if ($$3.a($$0, $$1)) {
                return $$3;
            }
            return null;
        }
        for (int $$4 = 0; $$4 < this.size(); ++$$4) {
            dvl $$5 = (dvl)this.get($$4);
            if (!$$5.a($$0, $$1)) continue;
            return $$5;
        }
        return null;
    }

    public dvm a() {
        dvm $$0 = new dvm(this.size());
        for (dvl $$1 : this) {
            $$0.add($$1.v());
        }
        return $$0;
    }
}

