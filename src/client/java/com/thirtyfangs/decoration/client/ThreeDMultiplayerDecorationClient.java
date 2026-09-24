package com.thirtyfangs.decoration.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.network.chat.Component;

import java.util.ArrayDeque;
import java.util.Queue;

import static net.fabricmc.fabric.api.client.command.v2.ClientCommands.literal;

public class ThreeDMultiplayerDecorationClient implements ClientModInitializer {
	private static final String[] COOKIEJAR_COMMAND = {
		"function 3d_multiplayer_decoration:cookie_jar"
	};
	private static final String[] ASIANCHAIR_COMMAND = {
		"function 3d_multiplayer_decoration:asian_chair"
	};
	private static final String[] DRAWER_COMMAND = {
		"function 3d_multiplayer_decoration:drawer"
	};
	private static final String[] SIGN_COMMAND = {
		"function 3d_multiplayer_decoration:sign"
	};
	private static final String[] HYLIANSHIELD_COMMAND = {
		"function 3d_multiplayer_decoration:hylian_shield"
	};
	private static final String[] JAPANESELIGHT_COMMAND = {
		"function 3d_multiplayer_decoration:japanese_light"
	};
	private static final String[] MAJORASMASK_COMMAND = {
		"function 3d_multiplayer_decoration:majorasmask"
	};
	private static final String[] TREEBRANCH_COMMAND = {
		"function 3d_multiplayer_decoration:tree_branch"
	};
	private static final String[] TABLE_COMMAND = {
		"function 3d_multiplayer_decoration:table"
	};
	private static final String[] MULTITABLE_COMMAND = {
		"clientgive bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{Name:\"minecraft:orange_wool\",id:\"minecraft:orange_wool\",Properties:{}},transformation:[-0.6787518456f,0f,0.1292034965f,0.775f,0f,-0.046f,0f,1f,0.1093260355f,0f,0.8021612721f,0.044375f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Table\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:table\"] 1",
		"clientgive bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{id:\"minecraft:oak_slab\",Name:\"minecraft:oak_slab\",Properties:{type:\"bottom\"}},transformation:[-0.125f,0f,0f,0.125f,0f,-1.4645f,0f,0.72375f,0f,0f,0.125f,0f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Table\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:table\"] 1",
		"clientgive bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{id:\"minecraft:oak_slab\",Name:\"minecraft:oak_slab\",Properties:{type:\"bottom\"}},transformation:[-0.125f,0f,0f,1f,0f,-1.4645f,0f,0.72375f,0f,0f,0.125f,0f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Table\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:table\"] 1",
		"clientgive bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{id:\"minecraft:oak_slab\",Name:\"minecraft:oak_slab\",Properties:{type:\"bottom\"}},transformation:[-1f,0f,0f,1f,0f,-0.4815f,0f,0.963125f,0f,0f,1f,0f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Table\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:table\"] 1",
		"clientgive bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{id:\"minecraft:oak_slab\",Name:\"minecraft:oak_slab\",Properties:{type:\"bottom\"}},transformation:[-0.125f,0f,0f,1f,0f,-1.4645f,0f,0.72375f,0f,0f,0.125f,0.875f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Table\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:table\"] 1",
		"clientgive bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{id:\"minecraft:oak_slab\",Name:\"minecraft:oak_slab\",Properties:{type:\"bottom\"}},transformation:[-0.125f,0f,0f,0.125f,0f,-1.4645f,0f,0.72375f,0f,0f,0.125f,0.875f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Table\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:table\"] 1"
	
	};
	private static final String[] MULTISIGN_COMMAND = {
		"clientgive minecraft:bat_spawn_egg[entity_data={id:\"minecraft:item_display\",Rotation:[0F,0F],item:{id:\"minecraft:goat_horn\",count:1},item_display:\"none\",transformation:[0f,0f,-2.3125f,0.52125f,0.7244443697f,-0.404404758f,0f,1f,-0.1941142838f,-1.5092591036f,0f,0.4360616937f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Sign\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:sign\"] 1",
		"clientgive minecraft:bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{id:\"minecraft:stripped_spruce_wood\",Name:\"minecraft:stripped_spruce_wood\",Properties:{axis:\"x\"}},transformation:[0f,0f,-0.125f,0.495f,0f,1.5f,0f,0f,0.125f,0f,0f,0.4360616937f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Sign\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:sign\"] 1",
		"clientgive minecraft:bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{id:\"minecraft:stripped_spruce_wood\",Name:\"minecraft:stripped_spruce_wood\",Properties:{axis:\"x\"}},transformation:[0f,0f,-0.125f,0.618125f,0.125f,0f,0f,1.856875f,0f,-0.8125f,0f,0.5610616937f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Sign\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:sign\"] 1",
		"clientgive minecraft:bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{id:\"minecraft:red_wool\",Name:\"minecraft:red_wool\",Properties:{}},transformation:[0f,0f,0.0625f,0.618125f,0f,-0.6875f,0f,1.981875f,0.25f,0f,0f,-0.2426883063f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Sign\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:sign\"] 1",
		"clientgive minecraft:bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{id:\"minecraft:red_wool\",Name:\"minecraft:red_wool\",Properties:{}},transformation:[0f,0f,0.0625f,0.618125f,0f,-0.9375f,0f,1.981875f,0.25f,0f,0f,0.0066866937f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Sign\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:sign\"] 1",
		"clientgive minecraft:bat_spawn_egg[entity_data={id:\"minecraft:block_display\",Rotation:[0F,0F],block_state:{id:\"minecraft:stripped_spruce_wood\",Name:\"minecraft:stripped_spruce_wood\",Properties:{axis:\"x\"}},transformation:[0f,0.1132333322f,-0.1207407283f,0.495f,0f,0.422592549f,0.0323523806f,1.45f,0.125f,0f,0f,0.4360616937f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Sign\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:sign\"] 1",
		"clientgive minecraft:bat_spawn_egg[entity_data={id:\"minecraft:item_display\",Rotation:[0F,0F],item:{id:\"minecraft:skeleton_skull\",count:1},item_display:\"none\",transformation:[0f,0f,-0.5f,0.5575f,-0.1346280057f,0.4815343187f,0f,2.19f,0.4815343187f,0.1346280057f,0f,0.5198116937f,0f,0f,0f,1f]},item_name={\"color\":\"#FFA64D\",\"text\":\"Sign\"},lore=[[{\"color\":\"#3838FF\",\"text\":\"Created with \"},{\"color\":\"#3838FF\",\"text\":\"3D Multiplayer Decoration\"}],{\"color\":\"#3D57FF\",\"text\":\"htttps://modrinth.com/mod/3d-multiplayer-decoration\"}],item_model=\"3d_multiplayer_decoration:sign\"] 1",
		"clientgive minecraft:oak_sign 1"
	};
	private static final Queue<String> DISPLAY_QUEUE = new ArrayDeque<>();
	private static int displayTick;
	@Override
	public void onInitializeClient() {
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (!DISPLAY_QUEUE.isEmpty() && client.player != null && displayTick++ % 5 == 0) {
				client.player.connection.sendCommand(DISPLAY_QUEUE.remove());
			}
		});

		ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> dispatcher.register(literal("3dgive")
			.then(literal("cookie_jar")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : COOKIEJAR_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one cookie jar"));

					return 1;
				}))
			.then(literal("asian_chair")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : ASIANCHAIR_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one asian chair"));

					return 1;
				}))
			.then(literal("drawer")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : DRAWER_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one drawer"));

					return 1;
				}))
			.then(literal("sign")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : SIGN_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one sign"));

					return 1;
				}))
			.then(literal("shield")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : HYLIANSHIELD_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one Hylian Shield"));

					return 1;
				}))
			.then(literal("japanese_light")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : JAPANESELIGHT_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you one japanese light"));

					return 1;
				}))
			.then(literal("majoras_mask")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : MAJORASMASK_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you Majora's Mask"));

					return 1;
				}))
			.then(literal("tree_branch")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : TREEBRANCH_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you a tree branch"));

					return 1;
				}))	
			.then(literal("table")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : TABLE_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you a table"));

					return 1;
				}))));
		ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> dispatcher.register(literal("3dgive_multiplayer")
			.then(literal("table")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : MULTITABLE_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you a table. Make sure to spawn each given item on the same block. If nothing is happening, click on the item to confirm its existence. Clientgive mod required"));

					return 1;
				}))
			.then(literal("sign")
				.executes(context -> {
					DISPLAY_QUEUE.clear();
					for (String command : MULTISIGN_COMMAND) {
						DISPLAY_QUEUE.add(command);
					}
					displayTick = 0;
					context.getSource().sendFeedback(Component.literal("Gave you a sign. Make sure to spawn each given item on the same block. If nothing is happening, click on the item to confirm its existence. Clientgive mod required"));

					return 1;
				}))));
	}
}