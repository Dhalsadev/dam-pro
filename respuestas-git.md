1. ¿Qué diferencia existe entre git add y git commit?
    Mientras que git add añade el cambio, git commit lo comenta para saber que hemos hecho.
2. ¿Qué hace git push? ¿Por qué puede ser rechazado?
    Git push guarda los cambios en el repositorio de github de forma remota y puede ser
    rechazado por no haber actualizado correctamente con git pull la copia local del 
    repositorio antes de hacer los cambios.
3. ¿En qué se diferencian git fetch y git pull?
    Git fech te permite ver los cambios remotos, mientras git pull modifica la rama
    local de inmediato con el riezgo de conflicto si hay modificaciones superpuestas.
4. ¿Qué significa origin/main?
    Es la rama principal del repositorio remoto.
5. ¿Qué muestra git status antes y después de git add?
    Antes de git add te muestra en rojo los archivos nuevos o modificados como archivos
    sin seguimiento y te indica que los añadas con el git add. Después del git add y el
    git commit, desaparece el archivo en rejo ysale que la rama esta adelantada y hay 
    que realizar un git push.
6. ¿Qué información muestra git diff --cached?
    Muestra las diferencias exactas entre el último commit realizado y los archivos ya
    añadidos con el git add.
7. ¿Para qué sirve git log --oneline HEAD..origin/main?
    Sirve para ver una lista resumdia de los commits que se han hecho en el repositorio
    de github y aún no tienes en tu rama local.
8. ¿Por qué conviene usar commits pequeños y descriptivos?
    Si algo falla es más fácil revertir o revisar un cambio pequeño que con uno gigante,
    tambien es más facíl de entender y es más limpio.
9. ¿Cómo has resuelto el push rechazado?
    Para resolverlo seguí los siguientes pasos:
    git fetch origin
    git log --oneline HEAD..origin/main
    git diff HEAD origin/main
    git pull --no-rebase origin main
    guarde el editor de mensaje de merge con control 0 y cerre con control x
    git status
    git push origin main
10. ¿En qué carpeta y ventana de IntelliJ estabas cuando ocurrió el rechazo?
    Estaba en ~/git/dam-pro-equipo2/unidad-03/README.md, aunque me volvio a 
    suceder de neuvo en ~/git/dam-pro-equipo2/unidad-09/README.md y tuve que 
    solucionarlo. Las dos veces estaba en la ventana de Intellij IDEA, en la
    pestaña de la terminal.