/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.spongepowered.api;

import org.spongepowered.api.attribute.Attribute;
import org.spongepowered.api.attribute.Operation;
import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.block.tile.TileEntityType;
import org.spongepowered.api.data.types.Art;
import org.spongepowered.api.data.types.BannerPatternShape;
import org.spongepowered.api.data.types.Career;
import org.spongepowered.api.data.types.CoalType;
import org.spongepowered.api.data.types.Comparison;
import org.spongepowered.api.data.types.CookedFish;
import org.spongepowered.api.data.types.DirtType;
import org.spongepowered.api.data.types.DisgusedBlockType;
import org.spongepowered.api.data.types.DyeColor;
import org.spongepowered.api.data.types.Fish;
import org.spongepowered.api.data.types.GoldenApple;
import org.spongepowered.api.data.types.Hinge;
import org.spongepowered.api.data.types.HorseColor;
import org.spongepowered.api.data.types.HorseStyle;
import org.spongepowered.api.data.types.HorseVariant;
import org.spongepowered.api.data.types.NotePitch;
import org.spongepowered.api.data.types.OcelotType;
import org.spongepowered.api.data.types.PlantType;
import org.spongepowered.api.data.types.PortionType;
import org.spongepowered.api.data.types.PrismarineType;
import org.spongepowered.api.data.types.Profession;
import org.spongepowered.api.data.types.QuartzType;
import org.spongepowered.api.data.types.RabbitType;
import org.spongepowered.api.data.types.RailDirection;
import org.spongepowered.api.data.types.SandstoneType;
import org.spongepowered.api.data.types.SkeletonType;
import org.spongepowered.api.data.types.SkullType;
import org.spongepowered.api.data.types.SlabType;
import org.spongepowered.api.data.types.StairShape;
import org.spongepowered.api.data.types.StoneType;
import org.spongepowered.api.data.types.TreeType;
import org.spongepowered.api.data.types.WallType;
import org.spongepowered.api.effect.particle.ParticleType;
import org.spongepowered.api.effect.sound.SoundType;
import org.spongepowered.api.entity.EntityInteractionType;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.player.gamemode.GameMode;
import org.spongepowered.api.item.Enchantment;
import org.spongepowered.api.item.FireworkShape;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.inventory.equipment.EquipmentType;
import org.spongepowered.api.potion.PotionEffectType;
import org.spongepowered.api.scoreboard.Visibility;
import org.spongepowered.api.scoreboard.critieria.Criterion;
import org.spongepowered.api.scoreboard.objective.displaymode.ObjectiveDisplayMode;
import org.spongepowered.api.stats.Statistic;
import org.spongepowered.api.stats.StatisticFormat;
import org.spongepowered.api.stats.StatisticGroup;
import org.spongepowered.api.stats.achievement.Achievement;
import org.spongepowered.api.text.chat.ChatType;
import org.spongepowered.api.text.format.TextColor;
import org.spongepowered.api.text.selector.SelectorType;
import org.spongepowered.api.text.translation.Translatable;
import org.spongepowered.api.text.translation.Translation;
import org.spongepowered.api.util.rotation.Rotation;
import org.spongepowered.api.world.DimensionType;
import org.spongepowered.api.world.GeneratorType;
import org.spongepowered.api.world.biome.BiomeType;
import org.spongepowered.api.world.difficulty.Difficulty;
import org.spongepowered.api.world.gen.WorldGeneratorModifier;
import org.spongepowered.api.world.weather.Weather;

/**
 * Enumeration of all known {@link CatalogType}s for autocompletion when using the
 * {@link GameRegistry#getType(Class, String)} and {@link
 * GameRegistry#getAllOf(Class)}.
 */
public final class CatalogTypes {

    public static final Class<Achievement> ACHIEVEMENT = Achievement.class;
    public static final Class<Art> ART = Art.class;
    public static final Class<Attribute> ATTRIBUTE = Attribute.class;
    public static final Class<BannerPatternShape> BANNER_PATTERN_SHAPE = BannerPatternShape.class;
    public static final Class<BiomeType> BIOME_TYPE = BiomeType.class;
    public static final Class<BlockType> BLOCK_TYPE = BlockType.class;
    public static final Class<Career> CAREER = Career.class;
    public static final Class<ChatType> CHAT_TYPE = ChatType.class;
    public static final Class<CoalType> COAL_TYPE = CoalType.class;
    public static final Class<Comparison> COMPARISON_TYPE = Comparison.class;
    public static final Class<CookedFish> COOKED_FISH = CookedFish.class;
    public static final Class<Criterion> CRITERION = Criterion.class;
    public static final Class<Difficulty> DIFFICULTY = Difficulty.class;
    public static final Class<DimensionType> DIMENSION_TYPE = DimensionType.class;
    public static final Class<DirtType> DIRT_TYPE = DirtType.class;
    public static final Class<DisgusedBlockType> DISGUSED_BLOCK_TYPE = DisgusedBlockType.class;
    public static final Class<DyeColor> DYE_COLOR = DyeColor.class;
    public static final Class<Enchantment> ENCHANTMENT = Enchantment.class;
    public static final Class<EntityInteractionType> ENTITY_INTERACTION_TYPE = EntityInteractionType.class;
    public static final Class<EntityType> ENTITY_TYPE = EntityType.class;
    public static final Class<EquipmentType> EQUIPMENT_TYPE = EquipmentType.class;
    public static final Class<FireworkShape> FIREWORK_SHAPE = FireworkShape.class;
    public static final Class<Fish> FISH = Fish.class;
    public static final Class<GameMode> GAME_MODE = GameMode.class;
    public static final Class<GeneratorType> GENERATOR_TYPE = GeneratorType.class;
    public static final Class<GoldenApple> GOLDEN_APPLE = GoldenApple.class;
    public static final Class<Hinge> HINGE = Hinge.class;
    public static final Class<HorseColor> HORSE_COLOR = HorseColor.class;
    public static final Class<HorseStyle> HORSE_STYLE = HorseStyle.class;
    public static final Class<HorseVariant> HORSE_VARIANT = HorseVariant.class;
    public static final Class<NotePitch> NOTE_PITCH = NotePitch.class;
    public static final Class<ItemType> ITEM_TYPE = ItemType.class;
    public static final Class<ObjectiveDisplayMode> OBJECTIVE_DISPLAY_MODE = ObjectiveDisplayMode.class;
    public static final Class<OcelotType> OCELOT_TYPE = OcelotType.class;
    public static final Class<Operation> OPERATION = Operation.class;
    public static final Class<ParticleType> PARTICLE_TYPE = ParticleType.class;
    public static final Class<PlantType> PLANT_TYPE = PlantType.class;
    public static final Class<PotionEffectType> POTION_EFFECT_TYPE = PotionEffectType.class;
    public static final Class<PortionType> PORTION_TYPE = PortionType.class;
    public static final Class<PrismarineType> PRISMARINE_TYPE = PrismarineType.class;
    public static final Class<Profession> PROFESSION = Profession.class;
    public static final Class<QuartzType> QUARTZ_TYPE = QuartzType.class;
    public static final Class<RabbitType> RABBIT_TYPE = RabbitType.class;
    public static final Class<RailDirection> RAIL_DIRECTION = RailDirection.class;
    public static final Class<Rotation> ROTATION = Rotation.class;
    public static final Class<SandstoneType> SANDSTONE_TYPE = SandstoneType.class;
    public static final Class<SelectorType> SELECTOR_TYPE = SelectorType.class;
    public static final Class<SkeletonType> SKELETON_TYPE = SkeletonType.class;
    public static final Class<SkullType> SKULL_TYPE = SkullType.class;
    public static final Class<SlabType> SLAB_TYPE = SlabType.class;
    public static final Class<SoundType> SOUND_TYPE = SoundType.class;
    public static final Class<StairShape> STAIR_SHAPE = StairShape.class;
    public static final Class<Statistic> STATISTIC = Statistic.class;
    public static final Class<StatisticFormat> STATISTIC_FORMAT = StatisticFormat.class;
    public static final Class<StatisticGroup> STATISTIC_GROUP = StatisticGroup.class;
    public static final Class<StoneType> STONE_TYPE = StoneType.class;
    public static final Class<TextColor> TEXT_COLOR = TextColor.class;
    public static final Class<TileEntityType> TILE_ENTITY_TYPE = TileEntityType.class;
    public static final Class<TreeType> TREE_TYPE = TreeType.class;
    public static final Class<Translation> TRANSLATION = Translation.class;
    public static final Class<Visibility> VISIBILITY = Visibility.class;
    public static final Class<WallType> WALL_TYPE = WallType.class;
    public static final Class<Weather> WEATHER = Weather.class;
    public static final Class<WorldGeneratorModifier> WORLD_GENERATOR_MODIFIER = WorldGeneratorModifier.class;

    private CatalogTypes() {
    }
}
