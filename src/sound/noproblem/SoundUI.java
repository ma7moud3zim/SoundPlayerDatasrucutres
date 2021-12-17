
package sound.noproblem;

import jaco.mp3.player.MP3Player;
import jaco.mp3.*;
import java.io.File;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.nio.file.Paths;
import static javafx.scene.input.KeyCode.M;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class SoundUI extends javax.swing.JFrame { 
    SongData songs = new SongData();
    int x;
    int y;
      
        
    public SoundUI() {
        
        this.setBounds(150,150,624, 538);
        this.setTitle("Sound Player");
        initComponents();
 
        
//        SongName.setText(list.songList[3].fileName);
//        list.songList[3].player = list.songList[3].GetMp3player();
//        list.songList[3].player.addToPlayList(list.songList[3].songfile);
//        list.songList[3].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        
     
        AllSongs.setModel(new DefaultComboBoxModel<>(SongData.songNames));
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Playing = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Playstat = new javax.swing.JLabel();
        SongName = new javax.swing.JLabel();
        Setting = new javax.swing.JPanel();
        previousButton = new javax.swing.JLabel();
        nextButton = new javax.swing.JLabel();
        PauseButton = new javax.swing.JLabel();
        PlayingButton = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        List = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllSongs = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        playlistScreen = new javax.swing.JList<>();
        Adding = new javax.swing.JButton();
        Deleting = new javax.swing.JButton();
        MoveUpButton = new javax.swing.JButton();
        MoveDownButton = new javax.swing.JButton();
        SnameText = new javax.swing.JTextField();
        SsingerText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SearchingName = new javax.swing.JButton();
        SearchingSinger = new javax.swing.JButton();
        Beginning = new javax.swing.JButton();
        EndButton = new javax.swing.JButton();
        List1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AllSongs1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        List2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        AllSongs2 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        MainPanel.setBackground(new java.awt.Color(255, 102, 102));

        Title.setBackground(new java.awt.Color(85, 132, 172));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound/New Folder/pngaaa.com-1628130.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sound Player");

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TitleLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Playing.setBackground(new java.awt.Color(85, 132, 172));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        Playstat.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        Playstat.setText("Stopped:");

        SongName.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Playstat)
                .addGap(18, 18, 18)
                .addComponent(SongName, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SongName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Playstat, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );

        javax.swing.GroupLayout PlayingLayout = new javax.swing.GroupLayout(Playing);
        Playing.setLayout(PlayingLayout);
        PlayingLayout.setHorizontalGroup(
            PlayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PlayingLayout.setVerticalGroup(
            PlayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayingLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        Setting.setBackground(new java.awt.Color(85, 132, 172));

        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound/New Folder/previous.png"))); // NOI18N
        previousButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousButtonMouseClicked(evt);
            }
        });

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound/New Folder/next.png"))); // NOI18N
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });

        PauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound/New Folder/pause (1).png"))); // NOI18N
        PauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PauseButtonMouseClicked(evt);
            }
        });

        PlayingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound/New Folder/play-buttton.png"))); // NOI18N
        PlayingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayingButtonMouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound/New Folder/speaker.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound/New Folder/no-sound.png"))); // NOI18N

        javax.swing.GroupLayout SettingLayout = new javax.swing.GroupLayout(Setting);
        Setting.setLayout(SettingLayout);
        SettingLayout.setHorizontalGroup(
            SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(previousButton)
                .addGap(68, 68, 68)
                .addComponent(PauseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PlayingButton)
                .addGap(62, 62, 62)
                .addComponent(nextButton)
                .addGap(76, 76, 76)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(31, 31, 31))
        );
        SettingLayout.setVerticalGroup(
            SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingLayout.createSequentialGroup()
                        .addGroup(SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nextButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingLayout.createSequentialGroup()
                        .addGroup(SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SettingLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PauseButton)
                                    .addComponent(previousButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PlayingButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26))))
        );

        List.setBackground(new java.awt.Color(85, 132, 172));

        jScrollPane1.setViewportView(AllSongs);

        jScrollPane2.setViewportView(playlistScreen);

        Adding.setText("Add Song->");
        Adding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddingActionPerformed(evt);
            }
        });

        Deleting.setText("Delete");
        Deleting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletingActionPerformed(evt);
            }
        });

        MoveUpButton.setText("Move Up");
        MoveUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveUpButtonActionPerformed(evt);
            }
        });

        MoveDownButton.setText("Move Down");
        MoveDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveDownButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search by:   Name");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Search by:   Singer");

        SearchingName.setText("Search");
        SearchingName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchingNameActionPerformed(evt);
            }
        });

        SearchingSinger.setText("Search");
        SearchingSinger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchingSingerActionPerformed(evt);
            }
        });

        Beginning.setText("Beginning");
        Beginning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeginningActionPerformed(evt);
            }
        });

        EndButton.setText("End");
        EndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListLayout = new javax.swing.GroupLayout(List);
        List.setLayout(ListLayout);
        ListLayout.setHorizontalGroup(
            ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ListLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ListLayout.createSequentialGroup()
                                .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Adding, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Deleting, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Beginning, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MoveDownButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MoveUpButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EndButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ListLayout.createSequentialGroup()
                        .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(ListLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel13)))
                        .addGap(18, 18, 18)
                        .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ListLayout.createSequentialGroup()
                                .addComponent(SnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchingName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ListLayout.createSequentialGroup()
                                .addComponent(SsingerText, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchingSinger, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        ListLayout.setVerticalGroup(
            ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListLayout.createSequentialGroup()
                        .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(SearchingName))
                        .addGap(14, 14, 14)
                        .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(SsingerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchingSinger))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ListLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Adding)
                                .addGap(18, 18, 18)
                                .addComponent(Deleting)
                                .addGap(18, 18, 18)
                                .addComponent(Beginning)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EndButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MoveUpButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MoveDownButton)
                                .addGap(5, 5, 5))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        List1.setBackground(new java.awt.Color(85, 132, 172));

        jScrollPane3.setViewportView(AllSongs1);

        jScrollPane4.setViewportView(jList3);

        jButton5.setText("Add Song->");

        jButton6.setText("Delete");

        jButton7.setText("Move Up");

        jButton8.setText("Move Down");

        javax.swing.GroupLayout List1Layout = new javax.swing.GroupLayout(List1);
        List1.setLayout(List1Layout);
        List1Layout.setHorizontalGroup(
            List1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(List1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(List1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(List1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        List1Layout.setVerticalGroup(
            List1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(List1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(List1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(List1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        List2.setBackground(new java.awt.Color(85, 132, 172));

        jScrollPane5.setViewportView(AllSongs2);

        jScrollPane6.setViewportView(jList4);

        jButton9.setText("Add Song->");

        jButton10.setText("Delete");

        jButton11.setText("Move Up");

        jButton12.setText("Move Down");

        jLabel9.setText("Search by:   Name");

        javax.swing.GroupLayout List2Layout = new javax.swing.GroupLayout(List2);
        List2.setLayout(List2Layout);
        List2Layout.setHorizontalGroup(
            List2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(List2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(List2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(List2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(List2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(List2Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(List2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(List2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        List2Layout.setVerticalGroup(
            List2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(List2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(List2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(11, 11, 11)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(List2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(List2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Playing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(List, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(List1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(List2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Playing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(List2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(List1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 642, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            

    }//GEN-LAST:event_formWindowOpened

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int xMouse = evt.getXOnScreen();
        int yMouse = evt.getYOnScreen();
        
        this.setLocation(xMouse - x, yMouse - y);

    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
        
        
    }//GEN-LAST:event_formMousePressed

    private void PlayingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayingButtonMouseClicked
        int nx = songs.playing();
        try{
        Playstat.setText("Playing: ");
        SongName.setText(songs.playlist[nx].fileName);
        songs.playlist[nx].player = songs.playlist[nx].GetMp3player();
        songs.playlist[nx].player.addToPlayList(songs.playlist[nx].songfile);
        songs.playlist[nx].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        songs.playlist[nx].player.play();
        } catch(NullPointerException e){
              JOptionPane.showMessageDialog(null,"Add songs first");
        }
    }//GEN-LAST:event_PlayingButtonMouseClicked

    private void PauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseButtonMouseClicked
     try{
        Playstat.setText("Stopped:");
        songs.playlist[(songs.cntPlay)].player.pause();
     }
     catch(NullPointerException ex){
       JOptionPane.showMessageDialog(null,"Play a song first");
     }
    }//GEN-LAST:event_PauseButtonMouseClicked

    private void AddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddingActionPerformed
        String abs = AllSongs.getSelectedValue();
        SongData.addSong(abs);
        
      playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));

    }//GEN-LAST:event_AddingActionPerformed

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        songs.playlist[(songs.cntPlay)].player.stop();
        int nx = songs.next();
        
        Playstat.setText("Playing:");
        SongName.setText(songs.playlist[nx].fileName);
        songs.playlist[nx].player = songs.playlist[nx].GetMp3player();
        songs.playlist[nx].player.addToPlayList(songs.playlist[nx].songfile);
        songs.playlist[nx].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        songs.playlist[nx].player.play();
    }//GEN-LAST:event_nextButtonMouseClicked

    private void previousButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousButtonMouseClicked
         songs.playlist[(songs.cntPlay)].player.pause();
        int nx = songs.previous();
        
        Playstat.setText("Playing:");
        SongName.setText(songs.playlist[nx].fileName);
        songs.playlist[nx].player = songs.playlist[nx].GetMp3player();
        songs.playlist[nx].player.addToPlayList(songs.playlist[nx].songfile);
        songs.playlist[nx].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        songs.playlist[nx].player.play();
    }//GEN-LAST:event_previousButtonMouseClicked

    private void DeletingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletingActionPerformed
        try{ 
        int Dindx = playlistScreen.getSelectedIndex();
           if(Dindx == 0 && songs.cnt == 1) {
                songs.playlist[0].player.stop();
                Playstat.setText("Stopped:");
                SongName.setText(" ");
           } 
           songs.deleteSong(Dindx);
      playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));
        }
        catch(NullPointerException | ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Playlist is empty");    
        }
    }//GEN-LAST:event_DeletingActionPerformed

    private void BeginningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeginningActionPerformed
        try{
        songs.playlist[(songs.cntPlay)].player.stop();
        int beg = songs.getBeginning();
        
        Playstat.setText("Playing:");
        SongName.setText(songs.playlist[beg].fileName);
        songs.playlist[beg].player = songs.playlist[beg].GetMp3player();
        songs.playlist[beg].player.addToPlayList(songs.playlist[beg].songfile);
        songs.playlist[beg].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        songs.playlist[beg].player.play();
        }
        catch(NullPointerException e){
             JOptionPane.showMessageDialog(null,"There is no songs in list");
        }
        
    }//GEN-LAST:event_BeginningActionPerformed

    private void EndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButtonActionPerformed
   try{
        songs.playlist[(songs.cntPlay)].player.stop();
        int beg = songs.getEnd();
        
        Playstat.setText("Playing:");
        SongName.setText(songs.playlist[beg].fileName);
        songs.playlist[beg].player = songs.playlist[beg].GetMp3player();
        songs.playlist[beg].player.addToPlayList(songs.playlist[beg].songfile);
        songs.playlist[beg].currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        songs.playlist[beg].player.play();
        }
        catch(NullPointerException e){
             JOptionPane.showMessageDialog(null,"There is no songs in list");
        }
    }//GEN-LAST:event_EndButtonActionPerformed

    private void MoveUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveUpButtonActionPerformed
        try{
        songs.playlist[(songs.cntPlay)].player.stop();
        Playstat.setText("Stopped:");
        SongName.setText(" ");
        int mv = playlistScreen.getSelectedIndex();
        songs.moveUp(mv);
        
      playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));
    }
     catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Select a song");
        }
     catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Playlist is empty");    
        }
    }//GEN-LAST:event_MoveUpButtonActionPerformed

    private void MoveDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveDownButtonActionPerformed
        try{
        songs.playlist[(songs.cntPlay)].player.stop();
        Playstat.setText("Stopped:");
        SongName.setText(" ");        
        int mv = playlistScreen.getSelectedIndex();
        songs.moveDown(mv);
        
      playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Select a song");
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Playlist is empty");    
        }
    }//GEN-LAST:event_MoveDownButtonActionPerformed

    private void SearchingNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchingNameActionPerformed
        String nGet = SnameText.getText(); 
        String NameSong = songs.searchSongName(nGet);
         playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));

            JOptionPane.showMessageDialog(null, NameSong);

    }//GEN-LAST:event_SearchingNameActionPerformed

    private void SearchingSingerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchingSingerActionPerformed
   String nGet = SsingerText.getText(); 
        String NameSong = songs.searchSongSinger(nGet);
         playlistScreen.setModel(new DefaultComboBoxModel<>(SongData.playlistName));

            JOptionPane.showMessageDialog(null, NameSong);
    }//GEN-LAST:event_SearchingSingerActionPerformed


    public static void main(String args[]) {

            
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SoundUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoundUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoundUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoundUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoundUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adding;
    private javax.swing.JList<String> AllSongs;
    private javax.swing.JList<String> AllSongs1;
    private javax.swing.JList<String> AllSongs2;
    private javax.swing.JButton Beginning;
    private javax.swing.JButton Deleting;
    private javax.swing.JButton EndButton;
    private javax.swing.JPanel List;
    private javax.swing.JPanel List1;
    private javax.swing.JPanel List2;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton MoveDownButton;
    private javax.swing.JButton MoveUpButton;
    private javax.swing.JLabel PauseButton;
    private javax.swing.JPanel Playing;
    private javax.swing.JLabel PlayingButton;
    private javax.swing.JLabel Playstat;
    private javax.swing.JButton SearchingName;
    private javax.swing.JButton SearchingSinger;
    private javax.swing.JPanel Setting;
    private javax.swing.JTextField SnameText;
    private javax.swing.JLabel SongName;
    private javax.swing.JTextField SsingerText;
    private javax.swing.JPanel Title;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel nextButton;
    private javax.swing.JList<String> playlistScreen;
    private javax.swing.JLabel previousButton;
    // End of variables declaration//GEN-END:variables

    

}
