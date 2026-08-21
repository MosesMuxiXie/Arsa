/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface cee {
    public static final cee a = new cee(){

        @Override
        public <Value> Value a(cea<Value> $$0) {
            return $$0.b();
        }

        @Override
        public <Value> Value a(cea<Value> $$0, ftm $$1, @Nullable cej $$2) {
            return $$0.b();
        }
    };

    public <Value> Value a(cea<Value> var1);

    default public <Value> Value a(cea<Value> $$0, is $$1) {
        return this.a($$0, ftm.b($$1));
    }

    default public <Value> Value a(cea<Value> $$0, ftm $$1) {
        return this.a($$0, $$1, null);
    }

    public <Value> Value a(cea<Value> var1, ftm var2, @Nullable cej var3);
}

