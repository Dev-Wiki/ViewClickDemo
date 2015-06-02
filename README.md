# ViewClickDemo
View的onClickListener,onLongClickListener,onTouchListener研究

此Demo对应的文章在此:[View的Click,LongClick,Touch事件的研究](http://blog.csdn.net/devwiki/article/details/45965429)

最终的测试结果列表如下:

| 序号 | Click | LongClick | Down | Move | Up | 短按 | 长按 | 备注 |
|------|-------|-----------|------|------|----|------|------|------|
|1|无|true|true|true|true|down-move-up|down-move->up|无|
|2|无|true|false|true|true|down-move-up-longClick|down-move-longClick-move-up|按钮不抬起|
|3|无|true|true|true|false|down-move-up|down-move-up|无|
|4|无|true|false|true|false|down-move-up-click|down-move-longClick-move-up|无|
|5|无|false|true|true|true|down-move-up|down-move-up|无|
|6|无|false|false|true|true|down-move-up-longClick|down-move-longClick-move-up|按钮不抬起|
|7|无|false|true|true|false|down-move-up|down-move-up|无|
|8|无|false|false|true|false|down-move-up-click|down-move-longClick-move-up-click|无|
