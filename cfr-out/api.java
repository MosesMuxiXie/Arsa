/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface api<T, R> {
    public R apply(T var1) throws CommandSyntaxException;
}

