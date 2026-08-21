/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
import org.joml.Vector3f;

public class hpi {
    public static void a(fzm $$0, fzp $$1, fug $$2, double $$3, double $$4, double $$5, int $$6, float $$72) {
        fzm.a $$82 = $$0.c();
        $$2.a(($$7, $$8, $$9, $$10, $$11, $$12) -> {
            Vector3f $$13 = new Vector3f((float)($$10 - $$7), (float)($$11 - $$8), (float)($$12 - $$9)).normalize();
            $$1.a($$82, (float)($$7 + $$3), (float)($$8 + $$4), (float)($$9 + $$5)).a($$6).b($$82, $$13).a($$72);
            $$1.a($$82, (float)($$10 + $$3), (float)($$11 + $$4), (float)($$12 + $$5)).a($$6).b($$82, $$13).a($$72);
        });
    }
}

