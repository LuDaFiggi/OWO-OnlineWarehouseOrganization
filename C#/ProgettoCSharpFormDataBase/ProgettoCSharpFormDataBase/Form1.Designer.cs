﻿
namespace ProgettoCSharpFormDataBase
{
    partial class Form1
    {
        /// <summary>
        /// Variabile di progettazione necessaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Pulire le risorse in uso.
        /// </summary>
        /// <param name="disposing">ha valore true se le risorse gestite devono essere eliminate, false in caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Codice generato da Progettazione Windows Form

        /// <summary>
        /// Metodo necessario per il supporto della finestra di progettazione. Non modificare
        /// il contenuto del metodo con l'editor di codice.
        /// </summary>
        private void InitializeComponent()
        {
            this.BtnInvia = new System.Windows.Forms.Button();
            this.listView1 = new System.Windows.Forms.ListView();
            this.BtnVisualizza = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // BtnInvia
            // 
            this.BtnInvia.Location = new System.Drawing.Point(12, 12);
            this.BtnInvia.Name = "BtnInvia";
            this.BtnInvia.Size = new System.Drawing.Size(217, 53);
            this.BtnInvia.TabIndex = 0;
            this.BtnInvia.Text = "Invia";
            this.BtnInvia.UseVisualStyleBackColor = true;
            this.BtnInvia.Click += new System.EventHandler(this.BtnInvia_Click);
            // 
            // listView1
            // 
            this.listView1.HideSelection = false;
            this.listView1.Location = new System.Drawing.Point(235, 12);
            this.listView1.Name = "listView1";
            this.listView1.Size = new System.Drawing.Size(553, 426);
            this.listView1.TabIndex = 1;
            this.listView1.UseCompatibleStateImageBehavior = false;
            this.listView1.View = System.Windows.Forms.View.Details;
            this.listView1.ColumnClick += new System.Windows.Forms.ColumnClickEventHandler(this.listView1_ColumnClick);
            // 
            // BtnVisualizza
            // 
            this.BtnVisualizza.Location = new System.Drawing.Point(12, 71);
            this.BtnVisualizza.Name = "BtnVisualizza";
            this.BtnVisualizza.Size = new System.Drawing.Size(217, 53);
            this.BtnVisualizza.TabIndex = 2;
            this.BtnVisualizza.Text = "Visualizza";
            this.BtnVisualizza.UseVisualStyleBackColor = true;
            this.BtnVisualizza.Click += new System.EventHandler(this.BtnVisualizza_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.BtnVisualizza);
            this.Controls.Add(this.listView1);
            this.Controls.Add(this.BtnInvia);
            this.Name = "Form1";
            this.Text = "Progetto";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button BtnInvia;
        private System.Windows.Forms.ListView listView1;
        private System.Windows.Forms.Button BtnVisualizza;
    }
}

