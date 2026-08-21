/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface ib<A extends ArgumentType<?>, T extends a<A>> {
    public void a(T var1, wx var2);

    public T b(wx var1);

    public void a(T var1, JsonObject var2);

    public T a(A var1);

    public static interface a<A extends ArgumentType<?>> {
        public A b(dz var1);

        public ib<A, ?> a();
    }
}

