execute as @e[type=marker,tag=cookie_jar] at @s unless block ~ ~ ~ minecraft:barrier run function 3d_multiplayer_decoration:remove
execute as @e[type=marker,tag=drawer_east] at @s unless block ~ ~ ~ minecraft:barrier run function 3d_multiplayer_decoration:remove_drawer_east
execute as @e[type=marker,tag=drawer_north] at @s unless block ~ ~ ~ minecraft:barrier run function 3d_multiplayer_decoration:remove_drawer_north
execute as @e[type=marker,tag=drawer_south] at @s unless block ~ ~ ~ minecraft:barrier run function 3d_multiplayer_decoration:remove_drawer_south
execute as @e[type=marker,tag=drawer_west] at @s unless block ~ ~ ~ minecraft:barrier run function 3d_multiplayer_decoration:remove_drawer_west
execute as @e[type=marker,tag=sign] at @s unless block ~ ~ ~ minecraft:oak_sign run function 3d_multiplayer_decoration:remove