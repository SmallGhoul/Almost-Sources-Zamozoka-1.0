package net.optifine.features.module.ghost;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.config.Splitter;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.FakePlayerEntity;
import net.optifine.util.RotationUtils;
import net.optifine.util.RotationUtils.Rotation;
import net.optifine.util.math.MathUtils;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.combat.AntiBot;

import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class AimAssist extends Module implements RenderListener, UpdateListener {
   // $FF: synthetic field
   private final BooleanSetting Linda;
   // $FF: synthetic field
   private final NumberSetting William;
   // $FF: synthetic field
   private final NumberSetting Mary;
   // $FF: synthetic field
   private final BooleanSetting Margaret;
   // $FF: synthetic field
   private final BooleanSetting Jennifer;
   // $FF: synthetic field
   private final NumberSetting Elizabeth;
   // $FF: synthetic field
   private final NumberSetting George;
   // $FF: synthetic field
   private final NumberSetting James;
   // $FF: synthetic field
   float Jacob;
   // $FF: synthetic field
   private final NumberSetting Patricia;
   // $FF: synthetic field
   private final BooleanSetting Thomas;
   // $FF: synthetic field
   private final BooleanSetting Jessica;
   // $FF: synthetic field
   public class_1297 Jack;
   // $FF: synthetic field
   class_3541 Harry;
   // $FF: synthetic field
   private final NumberSetting Charlie;
   // $FF: synthetic field
   private final BooleanSetting Oscar;
   // $FF: synthetic field
   private final BooleanSetting Barbara;
   // $FF: synthetic field
   private final BooleanSetting Sarah;
   // $FF: synthetic field
   private final BooleanSetting Susan;

   private static int lllllllIII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static int llllllIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(RenderListener.class, this);
      this.Jack = null;
      "".length();
      if (" ".length() <= "   ".length()) {
         ;
      }
   }

   private static int llllllIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llllllIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public String Oliver() {
      String var1 = String.valueOf((new StringBuilder()).append(this.James.William()).append(" ").append(this.William.William()));
      "".length();
      return -"   ".length() > 0 ? null : var1;
   }

   double Oliver(class_1297 e) {
      double var2;
      if (e != null && mc.field_1724 != null) {
         var2 = (double)Math.abs(RotationUtils.to180(RotationUtils.getYawToVec(e.method_19538()) - mc.field_1724.field_6031)) * Math.pow((double)e.method_5739(mc.field_1724), 0.0D);
         "".length();
         if (-"   ".length() >= 0) {
            return 0.0D;
         }
      } else {
         var2 = 2.147483647E9D;
         "".length();
         if (null != null) {
            return 0.0D;
         }
      }

      return var2;
   }

   protected void Jacob() {
      Global.Jack().JacoB.Jack(false);
      this.Jacob = 0.0F;
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   private class_243 Oliver(class_243 currPos, float partialTicks) {
      class_238 aabb = this.Jack.method_5829();
      class_243 pos = aabb.method_1005().method_1019(currPos);
      class_243 eyePos = RotationUtils.getEyesPos();
      double playerY = eyePos.field_1351;
      double xLen = aabb.method_17939() / 2.0D;
      double yLen = aabb.method_17940() / 2.0D;
      double zLen = aabb.method_17941() / 2.0D;
      double diff = MathUtils.clamp((pos.field_1351 - playerY - 0.1D) / aabb.method_17940(), -1.0D, 1.0D);
      double down = -MathUtils.clamp(-1.0D, diff, 0.0D);
      double middle = 1.0D - Math.abs(diff);
      double up = MathUtils.clamp(0.0D, diff, 1.0D);
      double yPoint = (pos.field_1351 + yLen - 0.1D) * down + playerY * middle + (pos.field_1351 - yLen + 0.1D) * up;
      double x = pos.field_1352;
      double z = pos.field_1350;
      if (llllllIIlI(pos.field_1352 - eyePos.field_1352, xLen) > 0) {
         x -= xLen;
      }

      if (llllllIIll(pos.field_1352 - eyePos.field_1352, -xLen) < 0) {
         x += xLen;
      }

      if (llllllIIlI(pos.field_1350 - eyePos.field_1350, zLen) > 0) {
         z -= zLen;
      }

      if (llllllIIll(pos.field_1350 - eyePos.field_1350, -zLen) < 0) {
         z += zLen;
      }

      Optional<class_243> optionalPoint = aabb.method_992(RotationUtils.getEyesPos(partialTicks), RotationUtils.getEyesPos(partialTicks).method_1019(mc.field_1724.method_5720().method_1021(1000.0D)));
      class_243 var32;
      double amtY;
      if (optionalPoint.isPresent()) {
         double amtXZ = 0.0D;
         if (llllllIIlI(this.Mary.Jack(), 1.0D) != 0) {
            amtXZ = Math.max(0.0D, Math.abs((((class_243)optionalPoint.get()).field_1352 - aabb.method_1005().field_1352) * (((class_243)optionalPoint.get()).field_1350 - aabb.method_1005().field_1350) / xLen / zLen) - this.Mary.Jack()) / (1.0D - this.Mary.Jack());
         }

         amtY = 0.0D;
         if (llllllIIlI(this.Patricia.Jack(), 1.0D) != 0) {
            amtY = Math.max(0.0D, Math.abs(((class_243)optionalPoint.get()).field_1351 - aabb.method_1005().field_1351) / yLen - this.Patricia.Jack()) / (1.0D - this.Patricia.Jack());
         }

         var32 = new class_243(x * amtXZ + ((class_243)optionalPoint.get()).field_1352 * (1.0D - amtXZ), yPoint * amtY + ((class_243)optionalPoint.get()).field_1351 * (1.0D - amtY), z * amtXZ + ((class_243)optionalPoint.get()).field_1350 * (1.0D - amtXZ));
         "".length();
         if (-(150 ^ 172 ^ 103 ^ 89) >= 0) {
            return null;
         }
      } else {
         Optional<class_243> xPoint = aabb.method_1009(1000.0D, 0.0D, 0.0D).method_992(RotationUtils.getEyesPos(partialTicks), RotationUtils.getEyesPos(partialTicks).method_1019(mc.field_1724.method_5720().method_1021(1000.0D)));
         if (xPoint.isPresent()) {
            double amtY = Math.max(0.0D, Math.abs(((class_243)xPoint.get()).field_1351 - aabb.method_1005().field_1351) / yLen - 0.6D) / 0.4D;
            var32 = new class_243(x, yPoint * amtY + ((class_243)xPoint.get()).field_1351 * (1.0D - amtY), z);
            "".length();
            if (" ".length() >= "  ".length()) {
               return null;
            }
         } else {
            Optional<class_243> zPoint = aabb.method_1009(0.0D, 0.0D, 1000.0D).method_992(RotationUtils.getEyesPos(partialTicks), RotationUtils.getEyesPos(partialTicks).method_1019(mc.field_1724.method_5720().method_1021(1000.0D)));
            if (zPoint.isPresent()) {
               amtY = Math.max(0.0D, Math.abs(((class_243)zPoint.get()).field_1351 - aabb.method_1005().field_1351) / yLen - 0.6D) / 0.4D;
               var32 = new class_243(x, yPoint * amtY + ((class_243)zPoint.get()).field_1351 * (1.0D - amtY), z);
               "".length();
               if (" ".length() <= "".length()) {
                  return null;
               }
            } else {
               var32 = new class_243(x, yPoint, z);
               "".length();
               if (null != null) {
                  return null;
               }
            }
         }
      }

      return var32;
   }

   public AimAssist() {
      super("AimAssist", "Makes you good at aiming.", Category.Oscar);
      this.Charlie = new NumberSetting("Range", 5.0D, 1.0D, 10.0D, 0.05D, ValueDisplay.Oliver);
      this.Thomas = new BooleanSetting("On Click", true);
      this.George = new NumberSetting("Time after mouse pressed", "With \"On Click\" option it will means time after clicking", 150.0D, 50.0D, 1000.0D, 50.0D, ValueDisplay.Jack);
      this.Oscar = new BooleanSetting("Only On Weapon", true);
      this.James = new NumberSetting("Yaw Rotation Speed", 1.0D, 0.25D, 5.0D, 0.01D);
      this.William = new NumberSetting("Pitch Rotation Speed", 1.0D, 0.25D, 5.0D, 0.01D);
      this.Mary = new NumberSetting("Safe Body Zone by XZ", 0.35D, 0.0D, 1.0D, 0.01D);
      this.Patricia = new NumberSetting("Safe Body Zone by Y", 0.5D, 0.0D, 1.0D, 0.01D);
      this.Jennifer = new BooleanSetting("Pitch Aim", true);
      this.Elizabeth = new NumberSetting("FOV", 70.0D, 30.0D, 130.0D, 1.0D);
      this.Linda = new BooleanSetting("Attack Players", true);
      this.Barbara = new BooleanSetting("Attack Monsters", false);
      this.Susan = new BooleanSetting("Attack Animals", false);
      this.Margaret = new BooleanSetting("Attack Pets", false);
      this.Jessica = new BooleanSetting("Attack Invisible", false);
      this.Sarah = new BooleanSetting("Attack Dead", false);
      this.Harry = new class_3541(ThreadLocalRandom.current());
      this.Jacob = 0.0F;
      this.addSetting(new Splitter("General"));
      this.addSetting(this.Charlie);
      this.addSetting(this.Elizabeth);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      this.addSetting(new Splitter("Aim Settings", "Next values are needed to setup aim behavior"));
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      this.addSetting(this.Jennifer);
      this.addSetting(new Splitter("Targets", "With next settings you can choose your victims."));
      this.addSetting(this.Linda);
      this.addSetting(this.Barbara);
      this.addSetting(this.Susan);
      this.addSetting(this.Margaret);
      this.addSetting(this.Jessica);
      this.addSetting(this.Sarah);
      "".length();
      if (-(158 ^ 168 ^ 242 ^ 192) > 0) {
         throw null;
      }
   }

   public void Thomas() {
      this.Jack = this.George();
      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }

   static {
      "".length();
      if ((112 ^ 4 ^ 87 ^ 39) >= "  ".length()) {
         ;
      }
   }

   private class_1297 George() {
      class_1297 var5;
      if (mc.field_1687 != null && mc.field_1724 != null) {
         double rangeSq = Math.pow(this.Charlie.Jack(), 2.0D);
         Stream<class_1297> stream = StreamSupport.stream(mc.field_1687.method_18112().spliterator(), true).filter((e) -> {
            byte var10000;
            if (!e.field_5988) {
               var10000 = 1;
               "".length();
               if (null != null) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var1 = var10000;
            "".length();
            return (boolean)(null != null ? "".length() : var1);
         }).filter((e) -> {
            byte var10000;
            if (e instanceof class_1309 && (lllllllIII(((class_1309)e).method_6032(), 0.0F) > 0 || this.Sarah.Jack())) {
               var10000 = 1;
               "".length();
               if ((30 + 65 - 78 + 130 ^ 109 + 5 - 83 + 120) < 0) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var2 = var10000;
            "".length();
            return (boolean)((49 ^ 53) <= "   ".length() ? "".length() : var2);
         }).filter((e) -> {
            byte var10000;
            if (llllllIlll(mc.field_1724.method_5858(e), rangeSq) <= 0) {
               var10000 = 1;
               "".length();
               if ("   ".length() < 0) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var3 = var10000;
            "".length();
            return (boolean)("   ".length() <= 0 ? "".length() : var3);
         }).filter((e) -> {
            byte var10000;
            if (e != mc.field_1724) {
               var10000 = 1;
               "".length();
               if (" ".length() < -" ".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var1 = var10000;
            "".length();
            return (boolean)("  ".length() == (97 ^ 70 ^ 160 ^ 131) ? "".length() : var1);
         }).filter((e) -> {
            byte var10000;
            if (!(e instanceof class_1646)) {
               var10000 = 1;
               "".length();
               if (" ".length() <= -" ".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var1 = var10000;
            "".length();
            return (boolean)(-" ".length() > "   ".length() ? "".length() : var1);
         }).filter((e) -> {
            byte var10000;
            if (!(e instanceof FakePlayerEntity)) {
               var10000 = 1;
               "".length();
               if ("   ".length() < 0) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var1 = var10000;
            "".length();
            return (boolean)(null != null ? "".length() : var1);
         }).filter((e) -> {
            byte var10000;
            if (!(e instanceof class_1531)) {
               var10000 = 1;
               "".length();
               if ("  ".length() != "  ".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var1 = var10000;
            "".length();
            return (boolean)(-"  ".length() > 0 ? "".length() : var1);
         }).filter((e) -> {
            byte var10000;
            if (!Global.Oscar().contains(e.method_5820())) {
               var10000 = 1;
               "".length();
               if ((125 ^ 121) < -" ".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var1 = var10000;
            "".length();
            return (boolean)("".length() > " ".length() ? "".length() : var1);
         });
         if (Global.Jack().j.isEnabled()) {
            stream = stream.filter((e) -> {
               byte var10000;
               if (!mc.field_1724.method_5722(e)) {
                  var10000 = 1;
                  "".length();
                  if ("  ".length() > "   ".length()) {
                     return (boolean)"".length();
                  }
               } else {
                  var10000 = 0;
               }

               byte var1 = var10000;
               "".length();
               return (boolean)(null != null ? "".length() : var1);
            });
         }

         if (!this.Linda.Jack()) {
            stream = stream.filter((e) -> {
               byte var10000;
               if (!(e instanceof class_1657)) {
                  var10000 = 1;
                  "".length();
                  if ("".length() > 0) {
                     return (boolean)"".length();
                  }
               } else {
                  var10000 = 0;
               }

               byte var1 = var10000;
               "".length();
               return (boolean)((34 ^ 55 ^ 69 ^ 84) > (44 ^ 82 ^ 48 ^ 74) ? "".length() : var1);
            });
         }

         if (!this.Barbara.Jack()) {
            stream = stream.filter((e) -> {
               byte var10000;
               if (!(e instanceof class_1569)) {
                  var10000 = 1;
                  "".length();
                  if ((153 ^ 156) == 0) {
                     return (boolean)"".length();
                  }
               } else {
                  var10000 = 0;
               }

               byte var1 = var10000;
               "".length();
               return (boolean)(-(144 ^ 149) >= 0 ? "".length() : var1);
            });
         }

         if (!this.Susan.Jack()) {
            stream = stream.filter((e) -> {
               byte var10000;
               if (!(e instanceof class_1429) && !(e instanceof class_1421) && !(e instanceof class_1480)) {
                  var10000 = 1;
                  "".length();
                  if ("".length() != "".length()) {
                     return (boolean)"".length();
                  }
               } else {
                  var10000 = 0;
               }

               byte var1 = var10000;
               "".length();
               return (boolean)(-" ".length() > 0 ? "".length() : var1);
            });
         }

         if (!this.Margaret.Jack()) {
            stream = stream.filter((e) -> {
               byte var10000;
               if (e instanceof class_1321 && ((class_1321)e).method_6181()) {
                  var10000 = 0;
               } else {
                  var10000 = 1;
                  "".length();
                  if (-(45 ^ 105 ^ 248 ^ 184) > 0) {
                     return (boolean)"".length();
                  }
               }

               byte var1 = var10000;
               "".length();
               return (boolean)("".length() > "   ".length() ? "".length() : var1);
            }).filter((e) -> {
               byte var10000;
               if (e instanceof class_1496 && ((class_1496)e).method_6727()) {
                  var10000 = 0;
               } else {
                  var10000 = 1;
                  "".length();
                  if ((47 ^ 43) < "  ".length()) {
                     return (boolean)"".length();
                  }
               }

               byte var1 = var10000;
               "".length();
               return (boolean)("".length() >= "  ".length() ? "".length() : var1);
            });
         }

         if (!this.Jessica.Jack()) {
            stream = stream.filter((e) -> {
               byte var10000;
               if (!e.method_5767()) {
                  var10000 = 1;
                  "".length();
                  if ((190 ^ 186) <= "  ".length()) {
                     return (boolean)"".length();
                  }
               } else {
                  var10000 = 0;
               }

               byte var1 = var10000;
               "".length();
               return (boolean)(-" ".length() > 0 ? "".length() : var1);
            });
         }

         AntiBot antiBot = Global.Jack().var9;
         stream = stream.filter((e) -> {
            byte var10000;
            if (!antiBot.Oliver(e)) {
               var10000 = 1;
               "".length();
               if ("  ".length() <= "".length()) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var2 = var10000;
            "".length();
            return (boolean)((49 ^ 53) <= "   ".length() ? "".length() : var2);
         });
         stream = stream.filter(Objects::nonNull);
         stream = stream.filter((e) -> {
            byte var10000;
            if (llllllIllI((double)Math.abs(RotationUtils.to180(RotationUtils.getYawToVec(e.method_19538()) - mc.field_1724.field_6031)), this.Elizabeth.Jack()) < 0) {
               var10000 = 1;
               "".length();
               if (-(120 ^ 125) >= 0) {
                  return (boolean)"".length();
               }
            } else {
               var10000 = 0;
            }

            byte var2 = var10000;
            "".length();
            return (boolean)("".length() != 0 ? "".length() : var2);
         });
         var5 = (class_1297)stream.min(Comparator.comparingDouble(this::Oliver)).orElse((Object)null);
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         var5 = null;
         "".length();
         if (null != null) {
            return null;
         }
      }

      return var5;
   }

   public void Oliver(float partialTicks) {
      if (mc.field_1724 == null) {
         "".length();
         if ("  ".length() >= (185 ^ 147 ^ 124 ^ 82)) {
            return;
         }
      } else {
         int SUPERSAMPLE = Math.max(this.James.Oscar(), this.William.Oscar()) * 3 + 10;
         double frameTime = (double)mc.method_1534() / (double)SUPERSAMPLE;
         double accumulatedYaw = 0.0D;
         double accumulatedPitch = 0.0D;
         int i = 0;

         while(true) {
            if (i >= SUPERSAMPLE) {
               class_746 var28 = mc.field_1724;
               var28.field_6031 += RotationUtils.getFixedRotation((float)accumulatedYaw);
               mc.field_1724.field_5965 = MathUtils.clamp(-90.0F, RotationUtils.getFixedRotation((float)accumulatedPitch) + mc.field_1724.field_5965, 90.0F);
               "".length();
               if (" ".length() <= "".length()) {
                  return;
               }
               break;
            }

            String item = mc.field_1724.field_7514.method_7399().method_7909().toString();
            if (!mc.field_1690.field_1886.method_1434() || this.Oscar.Jack() && !item.toLowerCase().contains("sword") && !item.toLowerCase().contains("axe")) {
               this.Jacob = (float)((double)this.Jacob - frameTime / (double)this.George.George() * 50.0D);
            } else {
               this.Jacob = (float)((double)this.Jacob + frameTime / (double)this.George.George() * 50.0D);
               "".length();
               if ("".length() > "".length()) {
                  return;
               }
            }

            this.Jacob = MathUtils.clamp(0.0F, this.Jacob, 1.0F);
            if (mc.field_1724 == null || this.Jack == null) {
               "".length();
               if ("".length() != "".length()) {
                  return;
               }
               break;
            }

            if (!this.Thomas.Jack()) {
               this.Jacob = 1.0F;
            }

            if (llllllIlII(this.Jacob, 0.0F) > 0) {
               class_243 targetPos = new class_243((this.Jack.method_23317() - this.Jack.field_6014) * (double)partialTicks, (this.Jack.method_23318() - this.Jack.field_6036) * (double)partialTicks, (this.Jack.method_23321() - this.Jack.field_5969) * (double)partialTicks);
               Rotation rotation = RotationUtils.getNeededRotations(this.Oliver(targetPos, partialTicks), mc.field_1724.field_6031, mc.field_1724.field_5965);
               float deltaYaw = RotationUtils.to180(rotation.getYaw() - mc.field_1724.field_6031);
               float deltaPitch = RotationUtils.to180(rotation.getPitch() - mc.field_1724.field_5965);
               double yawSpeed = Math.abs(this.Harry.method_15433((double)System.currentTimeMillis() / 100.0D % 2.147483647E9D / 2.0D, 0.0D) / 4.0D + 1.5D);
               double pitchSpeed = Math.abs(this.Harry.method_15433((double)System.currentTimeMillis() / 100.0D % 2.147483647E9D / 2.0D, 1.0D) / 4.0D + 1.5D);
               float possibleShakeYaw = (float)this.Harry.method_15433((double)System.currentTimeMillis() / 100.0D % 2.147483647E9D / 2.0D, 2.0D) / 15.0F;
               float possibleShakePitch = (float)this.Harry.method_15433((double)System.currentTimeMillis() / 300.0D % 2.147483647E9D / 2.0D, 4.0D) / 7.0F;
               float pitchRotation = (float)((double)(deltaPitch / 5.0F) * this.William.Jack() * pitchSpeed * (double)this.Jacob);
               float yawRotation = (float)((double)(deltaYaw / 5.0F) * this.James.Jack() * yawSpeed * (double)this.Jacob);
               boolean var10000;
               if (llllllIlII(Math.abs(RotationUtils.getFixedRotation(yawRotation)), Math.abs(possibleShakeYaw * 2.0F)) <= 0 && llllllIlII(Math.abs(RotationUtils.getFixedRotation(pitchRotation)), Math.abs(possibleShakePitch * 2.0F)) <= 0) {
                  var10000 = false;
               } else {
                  var10000 = true;
                  "".length();
                  if ("".length() >= " ".length()) {
                     return;
                  }
               }

               boolean canShake = var10000;
               float shakeYaw = 0.0F;
               float shakePitch = 0.0F;
               if (canShake) {
                  shakeYaw = possibleShakeYaw;
                  shakePitch = possibleShakePitch;
               }

               float finalYawRot = yawRotation + shakeYaw;
               float finalPitchRot = pitchRotation + shakePitch;
               if (llllllIlIl((double)Math.abs(finalYawRot), this.Harry.method_15433((double)System.currentTimeMillis() / 100.0D % 2.147483647E9D / 2.0D, 20.0D) / 2.0D) > 0) {
                  accumulatedYaw += (double)finalYawRot * frameTime;
               }

               if (this.Jennifer.Jack() && llllllIlIl((double)Math.abs(finalPitchRot), this.Harry.method_15433((double)System.currentTimeMillis() / 100.0D % 2.147483647E9D / 2.0D, 21.0D) / 2.0D) > 0) {
                  accumulatedPitch += (double)finalPitchRot * frameTime;
               }
            }

            ++i;
            "".length();
            if ("   ".length() <= 0) {
               return;
            }
         }
      }

   }

   private static int llllllIIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llllllIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llllllIlII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
