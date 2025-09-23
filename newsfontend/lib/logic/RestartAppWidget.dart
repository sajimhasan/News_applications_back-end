import 'package:flutter/material.dart';

class Restartappwidegt extends StatefulWidget {
  final Widget child;

const Restartappwidegt({super.key , required this.child});


static void restartapp(BuildContext context){
 context.findAncestorStateOfType<_RestartappState>()?.RestartApp();

}

  @override
  State<Restartappwidegt> createState() => _RestartappState();
}

class _RestartappState extends State<Restartappwidegt> {
 

  Key key = UniqueKey(); 

   void RestartApp(){
    setState(() {
      key = UniqueKey();
    });
    
   }

  @override
  Widget build(BuildContext context) {
    return KeyedSubtree(
      key: key,
      child: widget.child);
  }
}