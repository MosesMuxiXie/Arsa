/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  oshi.SystemInfo
 *  oshi.hardware.CentralProcessor
 *  oshi.hardware.CentralProcessor$ProcessorIdentifier
 *  oshi.hardware.GlobalMemory
 *  oshi.hardware.GraphicsCard
 *  oshi.hardware.HardwareAbstractionLayer
 *  oshi.hardware.PhysicalMemory
 *  oshi.hardware.VirtualMemory
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.PhysicalMemory;
import oshi.hardware.VirtualMemory;

public class y {
    public static final long a = 0x100000L;
    private static final long b = 1000000000L;
    private static final Logger c = LogUtils.getLogger();
    private static final String d = System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
    private static final String e = System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
    private static final String f = System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
    private final Map<String, String> g = Maps.newLinkedHashMap();

    public y() {
        this.a("Minecraft Version", w.b().c());
        this.a("Minecraft Version ID", w.b().b());
        this.a("Operating System", d);
        this.a("Java Version", e);
        this.a("Java VM Version", f);
        this.a("Memory", () -> {
            Runtime $$0 = Runtime.getRuntime();
            long $$1 = $$0.maxMemory();
            long $$2 = $$0.totalMemory();
            long $$3 = $$0.freeMemory();
            long $$4 = $$1 / 0x100000L;
            long $$5 = $$2 / 0x100000L;
            long $$6 = $$3 / 0x100000L;
            return $$3 + " bytes (" + $$6 + " MiB) / " + $$2 + " bytes (" + $$5 + " MiB) up to " + $$1 + " bytes (" + $$4 + " MiB)";
        });
        this.a("CPUs", () -> String.valueOf(Runtime.getRuntime().availableProcessors()));
        this.a("hardware", () -> this.a(new SystemInfo()));
        this.a("JVM Flags", () -> y.a((String $$0) -> $$0.startsWith("-X")));
        this.a("Debug Flags", () -> y.a((String $$0) -> $$0.startsWith("-DMC_DEBUG_")));
    }

    private static String a(Predicate<String> $$0) {
        List<String> $$1 = ManagementFactory.getRuntimeMXBean().getInputArguments();
        List<String> $$2 = $$1.stream().filter($$0).toList();
        return String.format(Locale.ROOT, "%d total; %s", $$2.size(), String.join((CharSequence)" ", $$2));
    }

    public void a(String $$0, String $$1) {
        this.g.put($$0, $$1);
    }

    public void a(String $$0, Supplier<String> $$1) {
        try {
            this.a($$0, $$1.get());
        }
        catch (Exception $$2) {
            c.warn("Failed to get system info for {}", (Object)$$0, (Object)$$2);
            this.a($$0, "ERR");
        }
    }

    private void a(SystemInfo $$0) {
        HardwareAbstractionLayer $$1 = $$0.getHardware();
        this.a("processor", () -> this.a($$1.getProcessor()));
        this.a("graphics", () -> this.b($$1.getGraphicsCards()));
        this.a("memory", () -> this.a($$1.getMemory()));
        this.a("storage", this::b);
    }

    private void a(String $$0, Runnable $$1) {
        try {
            $$1.run();
        }
        catch (Throwable $$2) {
            c.warn("Failed retrieving info for group {}", (Object)$$0, (Object)$$2);
        }
    }

    public static float a(long $$0) {
        return (float)$$0 / 1048576.0f;
    }

    private void a(List<PhysicalMemory> $$0) {
        int $$1 = 0;
        for (PhysicalMemory $$2 : $$0) {
            String $$3 = String.format(Locale.ROOT, "Memory slot #%d ", $$1++);
            this.a($$3 + "capacity (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(y.a($$2.getCapacity()))));
            this.a($$3 + "clockSpeed (GHz)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf((float)$$2.getClockSpeed() / 1.0E9f)));
            this.a($$3 + "type", () -> ((PhysicalMemory)$$2).getMemoryType());
        }
    }

    private void a(VirtualMemory $$0) {
        this.a("Virtual memory max (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(y.a($$0.getVirtualMax()))));
        this.a("Virtual memory used (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(y.a($$0.getVirtualInUse()))));
        this.a("Swap memory total (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(y.a($$0.getSwapTotal()))));
        this.a("Swap memory used (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(y.a($$0.getSwapUsed()))));
    }

    private void a(GlobalMemory $$0) {
        this.a("physical memory", () -> this.a($$0.getPhysicalMemory()));
        this.a("virtual memory", () -> this.a($$0.getVirtualMemory()));
    }

    private void b(List<GraphicsCard> $$0) {
        int $$1 = 0;
        for (GraphicsCard $$2 : $$0) {
            String $$3 = String.format(Locale.ROOT, "Graphics card #%d ", $$1++);
            this.a($$3 + "name", () -> ((GraphicsCard)$$2).getName());
            this.a($$3 + "vendor", () -> ((GraphicsCard)$$2).getVendor());
            this.a($$3 + "VRAM (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(y.a($$2.getVRam()))));
            this.a($$3 + "deviceId", () -> ((GraphicsCard)$$2).getDeviceId());
            this.a($$3 + "versionInfo", () -> ((GraphicsCard)$$2).getVersionInfo());
        }
    }

    private void a(CentralProcessor $$0) {
        CentralProcessor.ProcessorIdentifier $$1 = $$0.getProcessorIdentifier();
        this.a("Processor Vendor", () -> ((CentralProcessor.ProcessorIdentifier)$$1).getVendor());
        this.a("Processor Name", () -> ((CentralProcessor.ProcessorIdentifier)$$1).getName());
        this.a("Identifier", () -> ((CentralProcessor.ProcessorIdentifier)$$1).getIdentifier());
        this.a("Microarchitecture", () -> ((CentralProcessor.ProcessorIdentifier)$$1).getMicroarchitecture());
        this.a("Frequency (GHz)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf((float)$$1.getVendorFreq() / 1.0E9f)));
        this.a("Number of physical packages", () -> String.valueOf($$0.getPhysicalPackageCount()));
        this.a("Number of physical CPUs", () -> String.valueOf($$0.getPhysicalProcessorCount()));
        this.a("Number of logical CPUs", () -> String.valueOf($$0.getLogicalProcessorCount()));
    }

    private void b() {
        this.a("jna.tmpdir");
        this.a("org.lwjgl.system.SharedLibraryExtractPath");
        this.a("io.netty.native.workdir");
        this.a("java.io.tmpdir");
        this.b("workdir", () -> "");
    }

    private void a(String $$0) {
        this.b($$0, () -> System.getProperty($$0));
    }

    private void b(String $$0, Supplier<@Nullable String> $$1) {
        String $$2 = "Space in storage for " + $$0 + " (MiB)";
        try {
            String $$3 = $$1.get();
            if ($$3 == null) {
                this.a($$2, "<path not set>");
                return;
            }
            FileStore $$4 = Files.getFileStore(Path.of($$3, new String[0]));
            this.a($$2, String.format(Locale.ROOT, "available: %.2f, total: %.2f", Float.valueOf(y.a($$4.getUsableSpace())), Float.valueOf(y.a($$4.getTotalSpace()))));
        }
        catch (InvalidPathException $$5) {
            c.warn("{} is not a path", (Object)$$0, (Object)$$5);
            this.a($$2, "<invalid path>");
        }
        catch (Exception $$6) {
            c.warn("Failed retrieving storage space for {}", (Object)$$0, (Object)$$6);
            this.a($$2, "ERR");
        }
    }

    public void a(StringBuilder $$0) {
        $$0.append("-- ").append("System Details").append(" --\n");
        $$0.append("Details:");
        this.g.forEach(($$1, $$2) -> {
            $$0.append("\n\t");
            $$0.append((String)$$1);
            $$0.append(": ");
            $$0.append((String)$$2);
        });
    }

    public String a() {
        return this.g.entrySet().stream().map($$0 -> (String)$$0.getKey() + ": " + (String)$$0.getValue()).collect(Collectors.joining(System.lineSeparator()));
    }
}

