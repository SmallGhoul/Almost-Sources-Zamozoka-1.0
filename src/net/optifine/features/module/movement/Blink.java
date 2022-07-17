package net.optifine.features.module.movement;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.FakePlayerEntity;
import net.optifine.util.math.RandomUtil;
import net.minecraft.class_1297;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.ArrayDeque;
import java.util.Iterator;

public final class Blink extends Module implements UpdateListener, PacketOutputListener {
   // $FF: synthetic field
   private final NumberSetting Oscar = new NumberSetting("Delay Randomization", 0.0D, 0.0D, 5.0D, 1.0D, (v) -> {
      String var10000;
      if (llIllllIII(v, 0.0D) == 0) {
         var10000 = "disabled";
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         var10000 = String.valueOf((new StringBuilder()).append((int)v).append(""));
      }

      String var2 = var10000;
      "".length();
      return "  ".length() < 0 ? null : var2;
   });
   // $FF: synthetic field
   private final NumberSetting Thomas = new NumberSetting("Randomization", 0.0D, 0.0D, 5.0D, 1.0D, (v) -> {
      String var10000;
      if (llIllllIlI(v, 0.0D) == 0) {
         var10000 = "disabled";
         "".length();
         if ("   ".length() <= 0) {
            return null;
         }
      } else {
         var10000 = String.valueOf((new StringBuilder()).append((int)v).append(""));
      }

      String var2 = var10000;
      "".length();
      return "".length() != 0 ? null : var2;
   });
   // $FF: synthetic field
   private final NumberSetting Charlie = new NumberSetting("Limit", 0.0D, 0.0D, 60.0D, 1.0D, (v) -> {
      String var10000;
      if (llIllllIll(v, 0.0D) == 0) {
         var10000 = "disabled";
         "".length();
         if ("   ".length() <= -" ".length()) {
            return null;
         }
      } else {
         var10000 = String.valueOf((new StringBuilder()).append((int)v).append(""));
      }

      String var2 = var10000;
      "".length();
      return "  ".length() >= (198 ^ 194) ? null : var2;
   });
   // $FF: synthetic field
   int Jack = 0;
   // $FF: synthetic field
   private final BooleanSetting William = new BooleanSetting("Fake Player", true);
   // $FF: synthetic field
   int Jacob = 0;
   // $FF: synthetic field
   int Harry = 0;
   // $FF: synthetic field
   private final NumberSetting George = new NumberSetting("Delay", "Delay between collecting packets.", 0.0D, 0.0D, 100.0D, 1.0D, (v) -> {
      String var10000;
      if (llIllllIIl(v, 0.0D) == 0) {
         var10000 = "disabled";
         "".length();
         if ("".length() >= "  ".length()) {
            return null;
         }
      } else {
         var10000 = String.valueOf((new StringBuilder()).append((int)v).append(""));
      }

      String var2 = var10000;
      "".length();
      return null != null ? null : var2;
   });
   // $FF: synthetic field
   private final BooleanSetting James = new BooleanSetting("All packets", true);
   // $FF: synthetic field
   private final ArrayDeque<class_2596<?>> Mary = new ArrayDeque();

   public Blink() {
      super("FakeLag", "Suspends all movement packets.", Category.Jack);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.James);
      this.addSetting(this.William);
      "".length();
      if (-" ".length() != -" ".length()) {
         throw null;
      }
   }

   private static int llIllllIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llIllllIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llIllllIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void onSentPacket(PacketOutputEvent event) {
      if (!this.James.Jack() && !(event.Jacob() instanceof class_2828)) {
         "".length();
         if (-" ".length() == "   ".length()) {
            return;
         }
      } else {
         ++this.Harry;
         if (this.George.Oscar() == 0 || this.Harry >= this.Jacob) {
            event.Oliver();
            this.Mary.addLast(event.Jacob());
         }

         "".length();
         if ("  ".length() <= 0) {
            return;
         }
      }

   }

   public void Thomas() {
      if (this.Charlie.Oscar() == 0) {
         "".length();
         if (-(158 + 16 - 21 + 41 ^ 135 + 170 - 199 + 92) >= 0) {
            return;
         }
      } else {
         if (this.Mary.size() >= this.Jack) {
            this.Jack(false);
            this.Jack(true);
         }

         "".length();
         if ("  ".length() == " ".length()) {
            return;
         }
      }

   }

   private static int llIllllIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Jacob() {
      if (mc.field_1724 == null) {
         this.Jack(false);
         "".length();
         if ((55 ^ 102 ^ 67 ^ 22) <= "  ".length()) {
            return;
         }
      } else {
         int var10001;
         int var10002;
         if (this.Charlie.Oscar() == 0) {
            var10001 = 0;
            "".length();
            if (-" ".length() == "".length()) {
               return;
            }
         } else {
            var10001 = this.Charlie.Oscar();
            if (this.Thomas.Oscar() != 0) {
               var10002 = RandomUtil.nextInt(-Math.min(this.Charlie.Oscar(), this.Thomas.Oscar()), this.Thomas.Oscar());
               "".length();
               if ("".length() != 0) {
                  return;
               }
            } else {
               var10002 = 0;
            }

            var10001 += var10002;
         }

         this.Jack = var10001;
         if (this.George.Oscar() == 0) {
            var10001 = 0;
            "".length();
            if ((80 + 15 - 57 + 103 ^ 60 + 130 - 150 + 97) < (114 ^ 62 ^ 115 ^ 59)) {
               return;
            }
         } else {
            var10001 = this.George.Oscar();
            if (this.Oscar.Oscar() != 0) {
               var10002 = RandomUtil.nextInt(-Math.min(this.George.Oscar(), this.Oscar.Oscar()), this.Oscar.Oscar());
               "".length();
               if ((162 ^ 167) == 0) {
                  return;
               }
            } else {
               var10002 = 0;
            }

            var10001 += var10002;
         }

         this.Jacob = var10001;
         if (this.William.Jack()) {
            FakePlayerEntity pl = new FakePlayerEntity(false);
            pl.method_5834(true);
            pl.method_5648(true);
         }

         EVENT_MANAGER.Oliver(UpdateListener.class, this);
         EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
         "".length();
         if (null != null) {
            return;
         }
      }

   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      if (mc.field_1687 != null) {
         Iterator var1 = mc.field_1687.method_18112().iterator();

         while(var1.hasNext()) {
            class_1297 e = (class_1297)var1.next();
            if (e instanceof FakePlayerEntity) {
               ((FakePlayerEntity)e).despawn();
            }

            "".length();
            if (" ".length() <= 0) {
               return;
            }
         }
      }

      this.Mary.forEach((p) -> {
         mc.field_1724.field_3944.method_2883(p);
         "".length();
         if ("".length() <= "  ".length()) {
            ;
         }
      });
      this.Mary.clear();
      "".length();
      if ("   ".length() > 0) {
         ;
      }
   }

   static {
      "".length();
      if (-" ".length() == -" ".length()) {
         ;
      }
   }
}
